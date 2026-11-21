package ru.practicum.sprint02._2_solid.dip;

public class SmsSender implements NotificationSender {

    @Override
    public void sendNotification(String message, String recipient) {
        System.out.printf("[SMS] %s: %s%n", recipient, message);
    }
}
