package com.dbc.notification.notificationuser.listeners;

import com.dbc.notification.notificationuser.listeners.config.KafkaInputStream;
import com.dbc.notification.notificationuser.model.Email;
import com.dbc.notification.notificationuser.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
public class NewNotificationListener {

    @Autowired
    private EmailService emailService;

    @StreamListener(KafkaInputStream.NEW_NOTIFICATION)
    public void listen(Email email) {
        System.out.println("Received body: " + email.toString());

        emailService.send(email);

        System.out.println("Email enviado com sucesso!");
    }
}
