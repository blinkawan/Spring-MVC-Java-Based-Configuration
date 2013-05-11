/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agung.init;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

/**
 *
 * @author awanlabs
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.agung.controller")
public class WebAppConfig {
    @Bean
    public InternalResourceViewResolver setUpViewResolver(){
        InternalResourceViewResolver resolver=new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/jsp/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
}
