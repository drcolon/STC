/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.dcm.stc.service.ws.impl;

import co.com.dcm.stc.api.constants.STCErrorCodeEnum;
import co.com.dcm.stc.api.exceptions.STCServiceException;
import co.com.dcm.stc.api.model.LogRecord;
import co.com.dcm.stc.api.remote.ws.STCProcessService;
import co.com.dcm.stc.api.model.remote.AnnouncementRequest;
import co.com.dcm.stc.api.model.remote.STCBasicResponse;
import co.com.dcm.stc.service.LogService; 
import java.util.Date;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Servicio expuesto a aplicacines terceras que inserta nuvos anuncios de
 * traslado en la terminal
 *
 * @author DanielCM
 */
//@WebService(endpointInterface = "co.com.dcm.stc.api.remote.ws.STCProcessService")
@Service("processService")
public class STCProcessServiceImpl implements STCProcessService {

    final static Logger LOGGER = Logger.getLogger(STCProcessServiceImpl.class);

    @Autowired
    private LogService logService;

    public STCProcessServiceImpl() {
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    @Override
    public STCBasicResponse createAnnouncements(AnnouncementRequest request) {
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("[Ejcutando Metodo [createAnnouncements]]");
            LOGGER.debug("[Param[request = " + request + "]]");
            LOGGER.debug("logRepository = " + logService);
        }

        STCBasicResponse stcBasicResponse
                = new STCBasicResponse(true, request.toString());

        try {
            LogRecord log = new LogRecord("createAnnouncements", request.toString(), new Date());
            log = logService.saveLog(log);
            log.setResponseData(stcBasicResponse.toString());
            log.setResponseTime(new Date());
            logService.saveLog(log);
        } catch (STCServiceException e) {
            stcBasicResponse.setSuccess(false);
            stcBasicResponse.setMessage(e.getMessage());
            stcBasicResponse.setErrorCode(e.getError().getCode());
        } catch (Exception exc) {
            LOGGER.error(exc.getMessage(), exc);
            stcBasicResponse.setSuccess(false);
            stcBasicResponse.setMessage(exc.getMessage());
            stcBasicResponse.setErrorCode(STCErrorCodeEnum.UNKNOWN_ERROR.getCode());
        }
        return stcBasicResponse;

    }

}
