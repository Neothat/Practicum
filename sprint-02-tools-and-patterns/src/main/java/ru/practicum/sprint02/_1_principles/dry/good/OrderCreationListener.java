package ru.practicum.sprint02._1_principles.dry.good;

import ru.practicum.sprint02._1_principles.dry.Order;

public class OrderCreationListener {

    private final UserNotificationService userNotificationService;
    private final CourierNotificationService courierNotificationService;

    public OrderCreationListener(UserNotificationService userNotificationService,
                                 CourierNotificationService courierNotificationService) {
        this.userNotificationService = userNotificationService;
        this.courierNotificationService = courierNotificationService;
    }

    public void onOrderCreate(Order order) {
        userNotificationService.notifyUser(order.user(), order);
        courierNotificationService.notifyCourier(order.courier(), order);
    }
}
