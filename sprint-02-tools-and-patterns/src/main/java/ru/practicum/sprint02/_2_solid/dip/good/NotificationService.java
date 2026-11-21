package ru.practicum.sprint02._2_solid.dip.good;

import ru.practicum.sprint02._2_solid.dip.NotificationSender;

// Зависит от абстракции, реализацию получает через конструктор. Самый предпочтительный вариант DI
public class NotificationService {

    private final NotificationSender notificationSender;

    public NotificationService(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    public void send(String message, String recipient) {
        if (recipient == null || recipient.isBlank()) {
            throw new IllegalArgumentException("Получатель не задан");
        }
        notificationSender.sendNotification(message, recipient);
    }
}
