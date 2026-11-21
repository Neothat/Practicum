package ru.practicum.sprint02._2_solid.ocp.price.good;

public record Electronics(double price, int quantity) implements Item {

    private static final double VAT = 0.2;

    @Override
    public double calculatePrice() {
        return price * quantity * (1 + VAT);
    }
}
