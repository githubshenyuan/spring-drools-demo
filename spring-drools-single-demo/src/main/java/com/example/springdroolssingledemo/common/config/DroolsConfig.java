package com.example.springdroolssingledemo.common.config;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DroolsConfig {

    @Bean
    KieContainer getKieContainer(){
        KieServices kieServices = KieServices.Factory.get();

        return kieServices.getKieClasspathContainer();

    }

}
