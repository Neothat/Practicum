package ru.practicum.sprint02._2_solid.ocp.price.good;

public record Book(double price, int quantity) implements Item {

    @Override
    public double calculatePrice() {
        return price * quantity;
    }
}
