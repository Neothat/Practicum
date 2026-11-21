package ru.practicum.sprint02._2_solid.lsp.delivery.good;

import ru.practicum.sprint02._2_solid.lsp.delivery.Order;

public interface DeliveryService {

    double calculateCost(Order order);

    boolean isEligibleForDelivery(Order order);
}
