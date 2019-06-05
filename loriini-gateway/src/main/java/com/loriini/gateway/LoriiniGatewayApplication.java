package com.loriini.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
//@EnableDiscoveryClient
//@EnableFeignClients
public class LoriiniGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoriiniGatewayApplication.class, args);
    }
}
