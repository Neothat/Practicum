package ru.practicum.sprint02._1_principles.yagni.bad;

import ru.practicum.sprint02._1_principles.yagni.User;

public class UserProfileServiceFacade {

    private final UserProfileService profileService;
    private final UserNotificationService notificationService;

    public UserProfileServiceFacade(UserProfileService profileService, UserNotificationService notificationService) {
        this.profileService = profileService;
        this.notificationService = notificationService;
    }

    public void updateProfile(User user) {
        profileService.updateProfile(user);
        notificationService.notifyUser(user);
    }
}
