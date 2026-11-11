package ru.practicum.sprint02._1_principles.kiss.good;

import ru.practicum.sprint02._1_principles.kiss.User;

public class Demo {

    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.saveUser(new User("anonymous", "ab8586e4-9d2f-4fab-b5f6-bc5b7cbdd34f"));
    }
}
