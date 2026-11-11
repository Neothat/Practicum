package ru.practicum.sprint02._1_principles.kiss.bad;

import ru.practicum.sprint02._1_principles.kiss.User;

public class DefaultUserFormatter implements UserFormatter {

    @Override
    public String formatUser(User user) {
        return String.format("username = %s, session_id = %s", user.username(), user.sessionId());
    }
}
