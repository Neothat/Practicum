package ru.practicum.sprint02._2_solid.srp.good;

import ru.practicum.sprint02._2_solid.srp.User;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class UserSearchRepository {

    private final Map<Long, User> storage;

    public UserSearchRepository(Map<Long, User> storage) {
        this.storage = storage;
    }

    public Optional<User> findById(long id) {
        return Optional.ofNullable(storage.get(id));
    }

    public List<User> findByRole(String role) {
        return storage.values().stream()
                .filter(user -> user.role().equals(role))
                .toList();
    }

    public List<User> findByUsernamePrefix(String prefix) {
        return storage.values().stream()
                .filter(user -> user.username().startsWith(prefix))
                .toList();
    }
}
