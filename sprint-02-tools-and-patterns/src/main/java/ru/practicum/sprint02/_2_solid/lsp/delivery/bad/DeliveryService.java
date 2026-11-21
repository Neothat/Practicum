package ru.practicum.sprint02._2_solid.lsp.delivery.bad;

import ru.practicum.sprint02._2_solid.lsp.delivery.Order;

public class DeliveryService {

    public double calculateCost(Order order) {
        return order.weight() * 10;
    }
}
