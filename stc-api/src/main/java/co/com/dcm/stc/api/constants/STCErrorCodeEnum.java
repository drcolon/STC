/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.com.dcm.stc.api.constants;

/**
 *
 * @author DanielCM
 */
public enum STCErrorCodeEnum {
    
    STC_LOG_ERROR("ERROR LOG"),
    ERROR("ERROR"),
    UNKNOWN_ERROR("ERROR_DESCONOCIDO");

    private String code;
    
    private STCErrorCodeEnum(String name) {
        this.code=name;
    }

    public String getCode() {
        return code;
    }
 
}
