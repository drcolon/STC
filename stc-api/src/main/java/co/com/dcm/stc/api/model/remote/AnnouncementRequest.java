/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.com.dcm.stc.api.model.remote;

import com.google.gson.Gson;

/**
 * Objeto de respuesta
 * @author DanielCM
 */
public class AnnouncementRequest {
    
    /**
     * User
     */
    private String user;
    
    /**
     * Containers nmber separated by ,
     */
    private String containerList;

    public AnnouncementRequest() {
    }

    public AnnouncementRequest(String user, String containerList) {
        this.user = user;
        this.containerList = containerList;
    }
    
   
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContainerList() {
        return containerList;
    }

    public void setContainerList(String containerList) {
        this.containerList = containerList;
    }

    @Override
    public String toString() {
       return  (new Gson()).toJson(this);
    }
    
    
    
}
