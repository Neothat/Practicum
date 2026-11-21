package ru.practicum.sprint02._2_solid.srp.good;

import ru.practicum.sprint02._2_solid.srp.User;

import java.util.NoSuchElementException;

// Сам ничего не решает, только связывает шаги в сценарий
public class UserOrchestrator {

    private final UserManager userManager;
    private final UserManagementRepository managementRepository;
    private final UserSearchRepository searchRepository;
    private final NotificationService notificationService;

    public UserOrchestrator(UserManager userManager,
                            UserManagementRepository managementRepository,
                            UserSearchRepository searchRepository,
                            NotificationService notificationService) {
        this.userManager = userManager;
        this.managementRepository = managementRepository;
        this.searchRepository = searchRepository;
        this.notificationService = notificationService;
    }

    public User createAndNotifyUser(String username) {
        User user = userManager.createUser(username);
        managementRepository.save(user);
        notificationService.sendEmail(user, "Добро пожаловать!");
        return user;
    }

    public User updateUsername(long userId, String newUsername) {
        User updated = userManager.updateUsername(getUser(userId), newUsername);
        managementRepository.save(updated);
        return updated;
    }

    public User assignRole(long userId, String role) {
        User updated = userManager.assignRole(getUser(userId), role);
        managementRepository.save(updated);
        notificationService.sendEmail(updated, "Вам назначена роль " + role);
        return updated;
    }

    public void deleteUser(long userId) {
        userManager.checkCanBeDeleted(getUser(userId));
        managementRepository.deleteById(userId);
    }

    private User getUser(long userId) {
        return searchRepository.findById(userId)
                .orElseThrow(() -> new NoSuchElementException("Пользователь не найден: " + userId));
    }
}
