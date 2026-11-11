package ru.practicum.sprint02._1_principles.dry.bad;

import ru.practicum.sprint02._1_principles.dry.Courier;
import ru.practicum.sprint02._1_principles.dry.EmailService;
import ru.practicum.sprint02._1_principles.dry.Order;

import java.time.format.DateTimeFormatter;

// Тот же шаблон даты, что и в UserNotificationService. Если поменяют в одном месте, то могут забыть во втором
public class CourierNotificationService {

    private final EmailService emailService;

    public CourierNotificationService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void notifyCourier(Courier courier, Order order) {
        String orderDate = order.date().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        emailService.sendEmail(courier.email(), "Сформирован новый заказ. Дата заказа: " + orderDate);
    }
}
