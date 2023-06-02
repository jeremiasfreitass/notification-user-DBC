package com.dbc.notification.notificationuser.service;

import com.dbc.notification.notificationuser.model.Email;

public interface EmailService {
    void send(Email email);
}
