package ru.practicum.sprint02._2_solid.ocp.price.good;

import java.util.List;

public class PriceCalculator {

    public double total(List<Item> items) {
        return items.stream()
                .mapToDouble(Item::calculatePrice)
                .sum();
    }
}
