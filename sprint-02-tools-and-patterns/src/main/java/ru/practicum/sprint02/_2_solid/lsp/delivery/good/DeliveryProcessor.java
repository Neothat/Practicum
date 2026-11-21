package ru.practicum.sprint02._2_solid.lsp.delivery.good;

import ru.practicum.sprint02._2_solid.lsp.delivery.Order;

import java.util.OptionalDouble;

// Работает с любой реализацией одинаково, про конкретные классы ничего не знает
public class DeliveryProcessor {

    public OptionalDouble processOrder(Order order, DeliveryService service) {
        if (!service.isEligibleForDelivery(order)) {
            return OptionalDouble.empty();
        }
        return OptionalDouble.of(service.calculateCost(order) + order.price());
    }

    public static void main(String[] args) {
        Order order = new Order(15, 100);
        DeliveryProcessor processor = new DeliveryProcessor();

        print("Бесплатная доставка", processor.processOrder(order, new FreeDeliveryService()));
        print("Стандартная доставка", processor.processOrder(order, new StandardDeliveryService()));
    }

    private static void print(String title, OptionalDouble total) {
        System.out.println(title + ": " + (total.isPresent() ? total.getAsDouble() : "недоступна для этого заказа"));
    }
}
