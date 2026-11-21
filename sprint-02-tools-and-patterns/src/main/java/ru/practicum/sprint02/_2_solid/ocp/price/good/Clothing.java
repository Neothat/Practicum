package ru.practicum.sprint02._2_solid.ocp.price.good;

public record Clothing(double price, int quantity) implements Item {

    private static final double DISCOUNT = 0.1;

    @Override
    public double calculatePrice() {
        return price * quantity * (1 - DISCOUNT);
    }
}
