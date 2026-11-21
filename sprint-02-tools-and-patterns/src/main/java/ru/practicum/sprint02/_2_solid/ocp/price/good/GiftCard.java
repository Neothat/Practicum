package ru.practicum.sprint02._2_solid.ocp.price.good;

// Новый тип товара: добавили класс, PriceCalculator не трогали
public record GiftCard(double nominal) implements Item {

    @Override
    public double calculatePrice() {
        return nominal;
    }
}
