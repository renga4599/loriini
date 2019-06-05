package com.loriini.notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @EnableDiscoveryClient -- No needed to use this annotation explicitly while using latest Spring cloud trail version.
 * @EnableFeignClients("com.loriini.notification") -- if you want to scan specific folder for feign clients
 */

@EnableFeignClients
@SpringBootApplication
@EnableSwagger2
public class LoriiniNotificationApplication {
    public static void main(String[] args) {
        SpringApplication.run(LoriiniNotificationApplication.class, args);
    }
}
