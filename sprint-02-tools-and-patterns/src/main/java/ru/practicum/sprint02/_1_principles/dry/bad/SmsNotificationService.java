package ru.practicum.sprint02._1_principles.dry.bad;

import ru.practicum.sprint02._1_principles.dry.NotificationService;

public class SmsNotificationService implements NotificationService {

    @Override
    public void sendNotification(String username, String text) {
        if (username == null || username.isBlank()) {
            throw new IllegalArgumentException();
        }
        if (text == null || text.isBlank()) {
            throw new IllegalArgumentException();
        }
        System.out.printf("[SMS] %s: %s%n", username, text);
    }
}
