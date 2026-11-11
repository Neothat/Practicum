package ru.practicum.sprint02._1_principles.intro.facade;

public class EmailNotifier {

    public void sendEmail(String username, String text) {
        System.out.printf("[EMAIL] %s: %s%n", username, text);
    }
}
