package com.example.Loose;

public class UserService {

    public static NotificationService notificationService;

    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public static void notifyUser(String message){
        notificationService.send(message); // ✅ correct
    }

    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public UserService() {
    }
}