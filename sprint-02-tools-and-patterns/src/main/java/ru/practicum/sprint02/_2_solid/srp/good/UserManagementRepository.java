package ru.practicum.sprint02._2_solid.srp.good;

import ru.practicum.sprint02._2_solid.srp.User;

import java.util.Map;

public class UserManagementRepository {

    private final Map<Long, User> storage;

    public UserManagementRepository(Map<Long, User> storage) {
        this.storage = storage;
    }

    public void save(User user) {
        storage.put(user.id(), user);
    }

    public void deleteById(long id) {
        storage.remove(id);
    }
}
