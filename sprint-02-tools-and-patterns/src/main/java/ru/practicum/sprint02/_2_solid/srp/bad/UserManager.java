package ru.practicum.sprint02._2_solid.srp.bad;

import ru.practicum.sprint02._2_solid.srp.User;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

// Бизнес-логика, хранение и уведомления в одном классе. Три причины для изменения
public class UserManager {

    private final Map<Long, User> storage = new HashMap<>();
    private final AtomicLong sequence = new AtomicLong();
    private final String smtpHost = "smtp.example.com";

    public User createUser(String username) {
        if (username == null || username.isBlank()) {
            throw new IllegalArgumentException("Имя пользователя не задано");
        }
        User user = new User(sequence.incrementAndGet(), username, "USER");
        saveToDatabase(user);
        sendEmailNotification(user);
        return user;
    }

    public void saveToDatabase(User user) {
        storage.put(user.id(), user);
    }

    public void sendEmailNotification(User user) {
        System.out.printf("[%s] %s: добро пожаловать!%n", smtpHost, user.username());
    }
}
