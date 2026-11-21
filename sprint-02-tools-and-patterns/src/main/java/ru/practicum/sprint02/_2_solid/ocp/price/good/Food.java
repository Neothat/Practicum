package ru.practicum.sprint02._2_solid.ocp.price.good;

public record Food(double pricePerKg, double weightKg) implements Item {

    @Override
    public double calculatePrice() {
        return pricePerKg * weightKg;
    }
}
