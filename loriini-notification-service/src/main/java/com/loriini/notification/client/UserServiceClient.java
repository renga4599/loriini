package com.loriini.notification.client;

import com.loriini.user.UserDetails;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @FeignClient(value = "user-service", url = "http://localhost:8300/user-service") -- Feign client with direct URL
 * Feign already internally uses ribbon to send requests.
 * @RibbonClient(name="user-service", configuration = RibbonConfiguration.class) -- if you want to use custom ribbon client configuration
 */

@FeignClient(name = "user-service")
@RibbonClient(name = "user-service")
public interface UserServiceClient {

    @GetMapping(path = "/api/v1/user/get", produces = MediaType.APPLICATION_JSON_VALUE)
    UserDetails getUserById();
}
