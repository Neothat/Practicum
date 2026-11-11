package ru.practicum.sprint02._1_principles.intro.facade;

public class SmsNotifier {

    public void sendSms(String username, String text) {
        System.out.printf("[SMS] %s: %s%n", username, text);
    }
}
