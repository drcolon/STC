/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.com.dcm.stc.api.model;

import com.google.gson.Gson;

/**
 * Clase que representa un contenedor
 * @author DanielCM
 */
public class Container {
    
    /**
     * identificador del contenedor
     */
    private long id;
    
    /**
     * numero del contenedor
     */
    private String containerNumber;

    public Container() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumber() {
        return containerNumber;
    }

    public void setNumber(String Number) {
        this.containerNumber = Number;
    }
    
    @Override
    public String toString() {
        return (new Gson()).toJson(this);
    }
    
}
