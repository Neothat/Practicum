package ru.practicum.sprint02._2_solid.srp.good;

import ru.practicum.sprint02._2_solid.srp.User;

import java.util.concurrent.atomic.AtomicLong;

// Только бизнес-правила. Задач несколько, но причина для изменения одна
public class UserManager {

    private final AtomicLong sequence = new AtomicLong();

    public User createUser(String username) {
        requireUsername(username);
        return new User(sequence.incrementAndGet(), username, "USER");
    }

    public User updateUsername(User user, String newUsername) {
        requireUsername(newUsername);
        return new User(user.id(), newUsername, user.role());
    }

    public User assignRole(User user, String role) {
        if (role == null || role.isBlank()) {
            throw new IllegalArgumentException("Роль не задана");
        }
        return new User(user.id(), user.username(), role);
    }

    public void checkCanBeDeleted(User user) {
        if ("ADMIN".equals(user.role())) {
            throw new IllegalStateException("Администратора удалить нельзя");
        }
    }

    private static void requireUsername(String username) {
        if (username == null || username.isBlank()) {
            throw new IllegalArgumentException("Имя пользователя не задано");
        }
    }
}
