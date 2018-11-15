package com.example.templateeurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TemplateEurekaServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(TemplateEurekaServiceApplication.class, args);
    }
}
