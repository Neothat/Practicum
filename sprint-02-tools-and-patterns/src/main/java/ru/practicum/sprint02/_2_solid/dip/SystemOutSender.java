package ru.practicum.sprint02._2_solid.dip;

// Для локального запуска: ничего никуда не отправляет, просто пишет в консоль
public class SystemOutSender implements NotificationSender {

    @Override
    public void sendNotification(String message, String recipient) {
        System.out.println("Сообщение " + message + " отправлено " + recipient);
    }
}
