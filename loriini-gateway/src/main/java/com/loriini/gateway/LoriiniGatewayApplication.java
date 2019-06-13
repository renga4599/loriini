package com.loriini.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableZuulProxy
//@EnableDiscoveryClient
//@EnableFeignClients
@EnableSwagger2
@EnableCircuitBreaker
public class LoriiniGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoriiniGatewayApplication.class, args);
    }
}
