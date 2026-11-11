package ru.practicum.sprint02._1_principles.dry.bad;

import ru.practicum.sprint02._1_principles.dry.EmailService;
import ru.practicum.sprint02._1_principles.dry.Order;
import ru.practicum.sprint02._1_principles.dry.User;

import java.time.format.DateTimeFormatter;

public class UserNotificationService {

    private final EmailService emailService;

    public UserNotificationService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void notifyUser(User user, Order order) {
        String orderDate = order.date().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        emailService.sendEmail(user.email(), "Ваш заказ отправлен! Дата заказа: " + orderDate);
    }
}
