package com.loriini.user.endpoint;

import com.loriini.user.UserDetails;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface UserControllerEndpoint {

    @PostMapping(path = "/api/v1/user", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<UserDetails> addUser(@RequestBody UserDetails userDetails);

    @GetMapping(path = "/api/v1/user/get", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<UserDetails> getUserById();
}
