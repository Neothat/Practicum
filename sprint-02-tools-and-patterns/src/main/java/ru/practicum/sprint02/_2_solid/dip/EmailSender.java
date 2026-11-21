package ru.practicum.sprint02._2_solid.dip;

public class EmailSender implements NotificationSender {

    @Override
    public void sendNotification(String message, String recipient) {
        System.out.printf("[EMAIL] %s: %s%n", recipient, message);
    }
}
