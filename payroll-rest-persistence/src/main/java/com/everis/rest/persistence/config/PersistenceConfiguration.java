package com.everis.rest.persistence.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.everis.rest.persistence.providers", "com.everis.rest.service.respositories" })
public class PersistenceConfiguration {

}
