package ru.practicum.sprint02._2_solid.lsp.delivery.bad;

import ru.practicum.sprint02._2_solid.lsp.delivery.Order;

// Клиент вынужден знать про конкретного наследника. Ограничение бесплатной доставки живёт не там, где должно
public class OrderCostCalculator {

    public double getTotalCost(Order order, DeliveryService service) {
        if (service instanceof FreeDeliveryService && order.weight() > 10) {
            throw new UnsupportedOperationException("Нельзя использовать бесплатную доставку для заказов тяжелее 10 кг");
        }
        return service.calculateCost(order) + order.price();
    }
}
