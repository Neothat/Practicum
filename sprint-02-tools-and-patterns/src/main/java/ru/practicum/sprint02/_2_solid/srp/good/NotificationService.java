package ru.practicum.sprint02._2_solid.srp.good;

import ru.practicum.sprint02._2_solid.srp.User;

public class NotificationService {

    private final String smtpHost;

    public NotificationService(String smtpHost) {
        this.smtpHost = smtpHost;
    }

    public void sendEmail(User user, String text) {
        System.out.printf("[%s] %s: %s%n", smtpHost, user.username(), text);
    }
}
