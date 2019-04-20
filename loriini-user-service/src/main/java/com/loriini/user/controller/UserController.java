package com.loriini.user.controller;

import com.loriini.user.UserDetails;
import com.loriini.user.config.UserConfigurationProperties;
import com.loriini.user.endpoint.UserControllerEndpoint;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RefreshScope
public class UserController implements UserControllerEndpoint {

    //@Value("user-service.fetch.fetchLimit")
    //private String maximumLimit;

    @Autowired
    private UserConfigurationProperties userConfigurationProperties;

    @Value("${user.allowedDomain}")
    private String allowedDomain;

    @Override
    public ResponseEntity<UserDetails> addUser(@RequestBody UserDetails userDetails) {
        log.info("UserController - addUser - UserDetails: {}", userDetails);
        log.info("UserController - addUser - allowedDomain: {}", allowedDomain);

        return new ResponseEntity<>(userDetails, HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<UserDetails> getUserById() {
        log.info("getUserById - userId: {}", "TEST");
        UserDetails userDetails = new UserDetails();
        userDetails.setId("TEST");
        userDetails.setName("Renga");
        return new ResponseEntity<>(userDetails, HttpStatus.OK);
    }
}
