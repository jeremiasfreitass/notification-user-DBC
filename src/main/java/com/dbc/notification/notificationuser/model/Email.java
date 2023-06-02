package com.dbc.notification.notificationuser.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Email {
    private String receiverEmail;
    private String name;
    private String message;
    private String subject;
}
