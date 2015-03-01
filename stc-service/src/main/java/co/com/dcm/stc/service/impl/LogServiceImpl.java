/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.com.dcm.stc.service.impl;

import co.com.dcm.stc.api.constants.STCErrorCodeEnum;
import co.com.dcm.stc.api.exceptions.STCServiceException;
import co.com.dcm.stc.api.model.LogRecord;
import co.com.dcm.stc.service.LogService;
import co.com.dcm.stc.service.repositories.LogRecordRepository;
import javax.annotation.Resource;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LogServiceImpl implements LogService {

    final static Logger LOGGER = Logger.getLogger(LogServiceImpl.class);
    
    @Resource
    LogRecordRepository logRepository;
    
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    @Override
    public LogRecord saveLog(LogRecord logRecord) {
    
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("[Ejcutando Metodo [saveLog]]");
            LOGGER.debug("[Param[logRecord = " + logRecord + "]]");
        }
        
        try {
            return logRepository.save(logRecord);    
        } catch (Exception e) {
           throw new STCServiceException(logRecord.toString(), STCErrorCodeEnum.ERROR, e);
        }
    
    }
    
}
