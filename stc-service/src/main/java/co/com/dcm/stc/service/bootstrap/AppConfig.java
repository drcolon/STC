/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.dcm.stc.service.bootstrap;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *
 * @author DanielCM
 */
@Configuration
@ComponentScan(basePackages = {"co.com.dcm.stc"})
@EnableTransactionManagement
@EnableJpaRepositories( basePackages = {"co.com.dcm.stc.service.repositories"})
public class AppConfig {

    public AppConfig() {
    }


}
