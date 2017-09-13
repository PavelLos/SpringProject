package com.los.project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.los.project.service"})
public class RootConfig {
    @Bean
    public String mfg(){
        return "dfd";
    }
}
