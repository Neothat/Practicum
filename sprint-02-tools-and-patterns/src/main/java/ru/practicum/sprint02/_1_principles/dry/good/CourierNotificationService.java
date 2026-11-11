package ru.practicum.sprint02._1_principles.dry.good;

import ru.practicum.sprint02._1_principles.dry.Courier;
import ru.practicum.sprint02._1_principles.dry.EmailService;
import ru.practicum.sprint02._1_principles.dry.Order;

public class CourierNotificationService {

    private final OrderDateFormatter orderDateFormatter;
    private final EmailService emailService;

    public CourierNotificationService(OrderDateFormatter orderDateFormatter, EmailService emailService) {
        this.orderDateFormatter = orderDateFormatter;
        this.emailService = emailService;
    }

    public void notifyCourier(Courier courier, Order order) {
        emailService.sendEmail(courier.email(), "Сформирован новый заказ. Дата заказа: " + orderDateFormatter.format(order));
    }
}
