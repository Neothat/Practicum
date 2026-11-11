package ru.practicum.sprint02._1_principles.kiss.bad;

import ru.practicum.sprint02._1_principles.kiss.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    private final List<User> storage = new ArrayList<>();
    private final UserLogger userLogger;

    public UserService(UserLogger userLogger) {
        this.userLogger = userLogger;
    }

    public void saveUser(User user) {
        storage.add(user);
        userLogger.log(user, "Пользователь сохранен");
    }
}
