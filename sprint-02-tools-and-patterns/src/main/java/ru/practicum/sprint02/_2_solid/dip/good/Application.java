package ru.practicum.sprint02._2_solid.dip.good;

import ru.practicum.sprint02._2_solid.dip.EmailSender;
import ru.practicum.sprint02._2_solid.dip.NotificationSender;
import ru.practicum.sprint02._2_solid.dip.SystemOutSender;

// Реализацию выбирают снаружи, в точке сборки приложения. Позже этим займётся Spring (IoC-контейнер)
public class Application {

    public static void main(String[] args) {
        NotificationSender sender = isLocalEnvironment() ? new SystemOutSender() : new EmailSender();
        NotificationService notificationService = new NotificationService(sender);
        notificationService.send("Заказ оформлен", "denis");
    }

    private static boolean isLocalEnvironment() {
        return !"prod".equals(System.getenv("APP_ENV"));
    }
}
