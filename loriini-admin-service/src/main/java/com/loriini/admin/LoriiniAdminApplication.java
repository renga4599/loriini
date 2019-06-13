package com.loriini.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableCircuitBreaker
public class LoriiniAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoriiniAdminApplication.class, args);
    }
}