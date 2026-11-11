package ru.practicum.sprint02._1_principles.kiss.bad;

import ru.practicum.sprint02._1_principles.kiss.User;

import java.util.Objects;

public class SystemOutUserLogger implements UserLogger {

    private final UserFormatter userFormatter;

    public SystemOutUserLogger(UserFormatter userFormatter) {
        this.userFormatter = Objects.requireNonNull(userFormatter, "userFormatter is null");
    }

    @Override
    public void log(User user, String message) {
        System.out.println(message + " {" + userFormatter.formatUser(user) + "}");
    }
}
