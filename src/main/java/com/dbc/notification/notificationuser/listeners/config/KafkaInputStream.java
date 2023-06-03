package com.dbc.notification.notificationuser.listeners.config;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.stereotype.Component;

@Component
public interface KafkaInputStream {

    String NEW_NOTIFICATION = "notification-input";

    @Input(KafkaInputStream.NEW_NOTIFICATION)
    SubscribableChannel notificationInput();
}
