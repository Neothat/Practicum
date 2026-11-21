package ru.practicum.sprint02._2_solid.dip.good;

import ru.practicum.sprint02._2_solid.dip.NotificationSender;

// Внедрение через сеттер тоже DI, но объект изменяемый и до вызова сеттера не готов к работе
public class SetterNotificationService {

    private NotificationSender notificationSender;

    public void setNotificationSender(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    public void send(String message, String recipient) {
        notificationSender.sendNotification(message, recipient);
    }
}
