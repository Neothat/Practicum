package ru.practicum.sprint02._2_solid.srp.bad;

import ru.practicum.sprint02._2_solid.srp.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

// Поиск и изменение данных в одном репозитории. Методов поиска со временем станет только больше
public class UserRepository {

    private final Map<Long, User> storage = new HashMap<>();

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

    public void save(User user) {
        storage.put(user.id(), user);
    }

    public void deleteById(long id) {
        storage.remove(id);
    }
}
