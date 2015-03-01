/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.com.dcm.stc.api.model.remote;

import com.google.gson.Gson;

/**
 * respuesta basica del servicio
 * @author DanielCM
 */
public class STCBasicResponse {
    
    /**
     * resultado de la peticion
     */
    private boolean success; 
    
    /**
     * Mensaje del servicio
     */
    private String message;
    
    /**
     * Codigo de error
     */
    private String errorCode;

    
    public STCBasicResponse() {
    }


    public STCBasicResponse(boolean success, String message) {
        this.success = success;
        this.message = message;
        this.errorCode="";
    }
    
    public STCBasicResponse(boolean success, String message, String errorCode) {
        this.success = success;
        this.message = message;
        this.errorCode=errorCode;
    }
    
    
    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
    
    
    
    @Override
    public String toString() {
        return (new Gson()).toJson(this);
    }
    
}
