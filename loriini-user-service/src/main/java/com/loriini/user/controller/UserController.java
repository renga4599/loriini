package com.loriini.user.controller;

import com.loriini.user.UserDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/api/v1/user")
    public ResponseEntity<UserDetails> getUserById() {

        UserDetails userDetails = new UserDetails();
        userDetails.setName("Renga");
        return new ResponseEntity<>(userDetails, HttpStatus.OK);
    }
}
