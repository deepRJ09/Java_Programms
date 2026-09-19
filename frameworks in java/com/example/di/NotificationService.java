package com.example.di;

@Service
public class NotificationService {
    public void sendNotification(String username) {
        System.out.println("Notification sent to "+username);
    }
}
