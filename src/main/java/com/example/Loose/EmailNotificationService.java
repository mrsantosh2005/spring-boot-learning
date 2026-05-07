package com.example.Loose;

public class EmailNotificationService implements NotificationService {

    @Override
    public void send(String message) {
        System.out.println("Santosh: " + message);
    }
}