/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.com.dcm.stc.service.repositories;


import co.com.dcm.stc.api.model.LogRecord;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 *
 * @author DanielCM
 */
public interface LogRecordRepository extends JpaRepository<LogRecord, Long>{
    
}
