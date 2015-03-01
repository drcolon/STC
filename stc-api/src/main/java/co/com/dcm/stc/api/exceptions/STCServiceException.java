/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.com.dcm.stc.api.exceptions;

import co.com.dcm.stc.api.constants.STCErrorCodeEnum;

/**
 *
 * @author DanielCM
 */
public class STCServiceException extends RuntimeException {

    final private STCErrorCodeEnum error;
    
    public STCServiceException(String message, STCErrorCodeEnum errorCode) {
        super(message);
        this.error=errorCode;
        
    }
    public STCServiceException(String message, STCErrorCodeEnum errorCode, Throwable e) {
        super(message, e);
         this.error=errorCode;
    }

    public STCErrorCodeEnum getError() {
        return error;
    }
    
    
    
}
