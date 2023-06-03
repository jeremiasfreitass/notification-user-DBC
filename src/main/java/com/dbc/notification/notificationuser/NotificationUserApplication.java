package com.dbc.notification.notificationuser;

import com.dbc.notification.notificationuser.listeners.config.KafkaInputStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.dbc.notification.notificationuser")
@SpringBootApplication
@EnableBinding(value = {KafkaInputStream.class})
public class NotificationUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotificationUserApplication.class, args);
	}

}
