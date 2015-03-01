/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.com.dcm.stc.api.model;

import com.google.gson.Gson;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 * clase en la que se almacenan los datos de log
 * @author DanielCM
 */
@Entity
@Table(name = "LOG")
public class LogRecord implements Serializable {
    
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    
    /**
     * tipo de operacion
     */
    @Column(name = "OPERACION")
    private String operationType;
    
    /**
     * request
     */
    @Column(name = "PETICION")
    private String requestData;
    
    /**
     * response
     */
    @Column(name = "RESPUESTA")
    private String responseData;
    
    /**
     * hora del request
     */
    @Column(name = "HORA_PETICION")
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date requestTime;
    
    /**
     * hora de la respuesta
     */
    @Column(name = "HORA_RESPUESTA")
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date responseTime;
    
    /**
     * usuario
     */
    @Column(name = "USUARIO")
    private String user;

    public LogRecord() {
    }

    public LogRecord(String operationType, String requestData, Date requestTime) {
        this.operationType = operationType;
        this.requestData = requestData;
        this.requestTime = requestTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public String getRequestData() {
        return requestData;
    }

    public void setRequestData(String requestData) {
        this.requestData = requestData;
    }

    public String getResponseData() {
        return responseData;
    }

    public void setResponseData(String responseData) {
        this.responseData = responseData;
    }

    public Date getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Date requestTime) {
        this.requestTime = requestTime;
    }

    public Date getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(Date responseTime) {
        this.responseTime = responseTime;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return (new Gson()).toJson(this); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
