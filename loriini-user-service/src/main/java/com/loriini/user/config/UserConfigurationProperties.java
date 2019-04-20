package com.loriini.user.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("user-service.user")
@Getter
@Setter
public class UserConfigurationProperties {

    private int fetchLimit;
}
