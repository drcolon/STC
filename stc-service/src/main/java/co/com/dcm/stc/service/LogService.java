/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.com.dcm.stc.service;

import co.com.dcm.stc.api.model.LogRecord;

/**
 * Allow a log data access
 * @author DanielCM
 */
public interface LogService {
    
    /**
     * Save a new log record
     * @param logRecord
     * @return 
     */
    LogRecord saveLog(LogRecord logRecord);
    
}
