package com.dbc.notification.notificationuser.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Email {
    private String receiverEmail;
    private String name;
    private String message;
    private String subject;
}
