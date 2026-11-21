package ru.practicum.sprint02._2_solid.lsp.delivery.good;

import ru.practicum.sprint02._2_solid.lsp.delivery.Order;

public class FreeDeliveryService implements DeliveryService {

    private static final double MAX_WEIGHT_KG = 10;

    @Override
    public double calculateCost(Order order) {
        return 0;
    }

    @Override
    public boolean isEligibleForDelivery(Order order) {
        return order.weight() <= MAX_WEIGHT_KG;
    }
}
