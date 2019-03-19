package com.loriini.user.controller;

import com.loriini.user.UserDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    public ResponseEntity<UserDetails> getUserById(){

        return new ResponseEntity<>(new UserDetails(), HttpStatus.OK);
    }
}
