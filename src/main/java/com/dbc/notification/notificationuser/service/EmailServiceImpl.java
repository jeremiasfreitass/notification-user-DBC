package com.dbc.notification.notificationuser.service;

import com.dbc.notification.notificationuser.model.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService{
    @Autowired
    private JavaMailSender sender;

    @Value("{spring.mail.username}")
    private String emailFrom;
    @Override
    public void send(Email email) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(emailFrom);
        message.setTo(email.getReceiverEmail());
        message.setSubject(email.getSubject());
        message.setText(email.getMessage());
        sender.send(message);
    }
}
