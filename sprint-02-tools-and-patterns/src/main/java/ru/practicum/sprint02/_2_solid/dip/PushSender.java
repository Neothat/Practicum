package ru.practicum.sprint02._2_solid.dip;

public class PushSender implements NotificationSender {

    @Override
    public void sendNotification(String message, String recipient) {
        System.out.printf("[PUSH] %s: %s%n", recipient, message);
    }
}
