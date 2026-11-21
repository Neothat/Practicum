package ru.practicum.sprint02._2_solid.lsp.delivery.good;

import ru.practicum.sprint02._2_solid.lsp.delivery.Order;

public class StandardDeliveryService implements DeliveryService {

    @Override
    public double calculateCost(Order order) {
        return order.weight() * 10;
    }

    @Override
    public boolean isEligibleForDelivery(Order order) {
        return true;
    }
}
