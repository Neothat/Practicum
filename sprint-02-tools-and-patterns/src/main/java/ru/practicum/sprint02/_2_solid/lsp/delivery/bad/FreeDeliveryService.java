package ru.practicum.sprint02._2_solid.lsp.delivery.bad;

import ru.practicum.sprint02._2_solid.lsp.delivery.Order;

public class FreeDeliveryService extends DeliveryService {

    @Override
    public double calculateCost(Order order) {
        return 0;
    }
}
