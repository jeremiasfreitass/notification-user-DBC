package com.dbc.notification.notificationuser.listeners;

import com.dbc.notification.notificationuser.listeners.config.KafkaInputStream;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
public class NewNotificationListener {

    @StreamListener(KafkaInputStream.NEW_NOTIFICATION)
    public void listen(String body) {
        System.out.println("Received body: " + body);
    }
}
