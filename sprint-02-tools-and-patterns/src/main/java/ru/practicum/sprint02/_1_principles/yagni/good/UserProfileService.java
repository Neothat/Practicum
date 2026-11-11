package ru.practicum.sprint02._1_principles.yagni.good;

import ru.practicum.sprint02._1_principles.yagni.User;

import java.util.HashMap;
import java.util.Map;

// Только то, что нужно сейчас. Понадобятся уведомления, тогда и добавим
public class UserProfileService {

    private final Map<Long, User> profiles = new HashMap<>();

    public void updateProfile(User user) {
        profiles.put(user.id(), user);
    }
}
