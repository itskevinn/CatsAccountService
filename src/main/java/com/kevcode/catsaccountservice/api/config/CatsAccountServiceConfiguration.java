package com.kevcode.catsaccountservice.api.config;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;

@Configuration
public class CatsAccountServiceConfiguration {
    @Autowired
    public EntityManager entityManager;

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
