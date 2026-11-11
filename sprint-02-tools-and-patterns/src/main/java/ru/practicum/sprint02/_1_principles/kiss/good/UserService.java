package ru.practicum.sprint02._1_principles.kiss.good;

import ru.practicum.sprint02._1_principles.kiss.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    private final List<User> storage = new ArrayList<>();

    public void saveUser(User user) {
        storage.add(user);
        System.out.printf("Пользователь сохранен {username = %s, session_id = %s}%n", user.username(), user.sessionId());
    }
}
