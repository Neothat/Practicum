package ru.practicum.sprint02._1_principles.intro.facade;

import java.util.Map;

// Фасад: отправитель вызывает один метод и не знает, через какой канал уйдёт сообщение
public class UserNotifier {

    private final EmailNotifier emailNotifier = new EmailNotifier();
    private final SmsNotifier smsNotifier = new SmsNotifier();
    private final PushNotifier pushNotifier = new PushNotifier();

    private final Map<String, NotificationChannel> preferredChannels;

    public UserNotifier(Map<String, NotificationChannel> preferredChannels) {
        this.preferredChannels = preferredChannels;
    }

    public void sendNotification(String username, String text) {
        switch (getUserNotificationChannel(username)) {
            case EMAIL -> emailNotifier.sendEmail(username, text);
            case SMS -> smsNotifier.sendSms(username, text);
            case PUSH -> pushNotifier.sendPush(username, text);
        }
    }

    private NotificationChannel getUserNotificationChannel(String username) {
        return preferredChannels.getOrDefault(username, NotificationChannel.EMAIL);
    }
}
