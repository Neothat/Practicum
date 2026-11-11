package ru.practicum.sprint02._1_principles.intro.facade;

public class PushNotifier {

    public void sendPush(String username, String text) {
        System.out.printf("[PUSH] %s: %s%n", username, text);
    }
}
