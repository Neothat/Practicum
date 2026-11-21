package ru.practicum.sprint02._2_solid.dip.bad;

import ru.practicum.sprint02._2_solid.dip.NotificationSender;

// Service Locator: зависимость спрятана внутри и по конструктору её не видно. Для теста придётся настраивать глобальный реестр
public class LocatorNotificationService {

    private final NotificationSender notificationSender;

    public LocatorNotificationService() {
        this.notificationSender = ServiceLocator.get(NotificationSender.class);
    }

    public void send(String message, String recipient) {
        notificationSender.sendNotification(message, recipient);
    }
}
