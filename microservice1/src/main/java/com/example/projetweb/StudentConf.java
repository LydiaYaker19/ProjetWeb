package com.example.projetweb;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class StudentConf {
    @Bean
    public RestTemplate restTemp() {
        return new RestTemplate();
    }
}
