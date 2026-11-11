package ru.practicum.sprint02._1_principles.dry.good;

import ru.practicum.sprint02._1_principles.dry.EmailService;
import ru.practicum.sprint02._1_principles.dry.Order;
import ru.practicum.sprint02._1_principles.dry.User;

public class UserNotificationService {

    private final OrderDateFormatter orderDateFormatter;
    private final EmailService emailService;

    public UserNotificationService(OrderDateFormatter orderDateFormatter, EmailService emailService) {
        this.orderDateFormatter = orderDateFormatter;
        this.emailService = emailService;
    }

    public void notifyUser(User user, Order order) {
        emailService.sendEmail(user.email(), "Ваш заказ отправлен! Дата заказа: " + orderDateFormatter.format(order));
    }
}
