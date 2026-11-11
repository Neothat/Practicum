package ru.practicum.sprint02._1_principles.dry.good;

import ru.practicum.sprint02._1_principles.dry.NotificationService;

import static ru.practicum.sprint02._1_principles.dry.good.Validation.requireNotBlank;

public class EmailNotificationService implements NotificationService {

    @Override
    public void sendNotification(String username, String text) {
        requireNotBlank(username, "username");
        requireNotBlank(text, "text");
        System.out.printf("[EMAIL] %s: %s%n", username, text);
    }
}
