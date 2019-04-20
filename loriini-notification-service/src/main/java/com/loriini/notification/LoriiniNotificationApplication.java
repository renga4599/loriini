package com.loriini.notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


//@EnableDiscoveryClient // No needed to use this annotation explicitly while using latest Spring cloud trail version.
//@EnableFeignClients("com.loriini.notification")
//@RibbonClient(name="user-service", configuration = RibbonConfiguration.class)

@EnableFeignClients
@SpringBootApplication
public class LoriiniNotificationApplication {
    public static void main(String[] args) {
        SpringApplication.run(LoriiniNotificationApplication.class, args);
    }
}
