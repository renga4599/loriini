package com.loriini.notification.controller;

import com.loriini.notification.client.UserServiceClient;
import com.loriini.notification.endpoint.NotificationEndPoint;
import com.loriini.user.UserDetails;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class NotificationController implements NotificationEndPoint {

    private final UserServiceClient userServiceClient;

    @Autowired
    public NotificationController(UserServiceClient userServiceClient) {
        this.userServiceClient = userServiceClient;
    }

    @Override
    public ResponseEntity<String> sendNotification() {

        try {
            log.info("NotificationController - sendNotification - notificationRequest: {}");
            UserDetails userById = userServiceClient.getUserById();
            return new ResponseEntity<>("SUCCESS!!!", HttpStatus.OK);

        } catch (Exception e) {
            log.error("NotificationController - sendNotification - exception: {}", e);
            return new ResponseEntity<>("Oooppps", HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
}
