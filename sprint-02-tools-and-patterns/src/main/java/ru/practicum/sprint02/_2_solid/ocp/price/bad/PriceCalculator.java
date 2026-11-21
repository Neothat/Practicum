package ru.practicum.sprint02._2_solid.ocp.price.bad;

// Каждый новый тип товара означает правку этого метода и перепроверку всех старых веток
public class PriceCalculator {

    public double calculatePrice(Object item) {
        if (item instanceof Book(double price, int quantity)) {
            return price * quantity;
        } else if (item instanceof Electronics(double price, int quantity)) {
            return price * quantity * 1.2;
        } else if (item instanceof Clothing(double price, int quantity)) {
            return price * quantity * 0.9;
        } else if (item instanceof Food(double pricePerKg, double weightKg)) {
            return pricePerKg * weightKg;
        }
        throw new IllegalArgumentException("Неизвестный тип товара: " + item);
    }
}
