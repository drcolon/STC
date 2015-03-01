/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.com.dcm.stc.api.remote.ws;

import co.com.dcm.stc.api.model.remote.AnnouncementRequest;
import co.com.dcm.stc.api.model.remote.STCBasicResponse;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Interfaz que define el servicio
 * @author DanielCM
 */
@WebService(name = "STCService")
public interface STCProcessService {
    
    /**
     * Creates a new announcements for each container found
     * in parameter list.
     * @param request 
     * @return 
     */
    @WebMethod(operationName = "createAnnouncements")
    STCBasicResponse createAnnouncements(@WebParam(name = "announcementRequest")AnnouncementRequest request);
    
}
