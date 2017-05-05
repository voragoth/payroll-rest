package com.everis.rest.service.config;

import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.everis.rest.service.services", "com.everis.rest.service.facades" })
public class ServiceConfiguration {

    @Bean(name = "org.dozer.Mapper")
    public DozerBeanMapper dozerBean() {
        DozerBeanMapper dozerBean = new DozerBeanMapper();
        return dozerBean;
    }

}
