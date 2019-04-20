package com.loriini.notification.model;

import com.loriini.common.model.ApplicationEvent;
import lombok.Data;

@Data
public class NotificationRequest {

    private ApplicationEvent applicationEvent;
    private String userId;
    private String userEmail;
}
