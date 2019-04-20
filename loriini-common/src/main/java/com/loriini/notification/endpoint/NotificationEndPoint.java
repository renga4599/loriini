package com.loriini.notification.endpoint;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public interface NotificationEndPoint {

    String NOTIFICATION_URL = "api/v1/notification";

    @GetMapping(value = NOTIFICATION_URL)
    ResponseEntity<String> sendNotification();

}
