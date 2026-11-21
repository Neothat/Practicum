package ru.practicum.sprint02._2_solid.dip.bad;

import ru.practicum.sprint02._2_solid.dip.EmailSender;

// Сервис сам создаёт конкретный EmailSender. Сменить канал или подменить его в тесте без правки кода нельзя
public class NotificationService {

    private final EmailSender emailSender = new EmailSender();

    public void send(String message, String recipient) {
        emailSender.sendNotification(message, recipient);
    }
}
