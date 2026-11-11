package ru.practicum.sprint02._1_principles.dry.good;

import ru.practicum.sprint02._1_principles.dry.Order;

import java.time.format.DateTimeFormatter;

public class OrderDateFormatter {

    private static final DateTimeFormatter ORDER_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public String format(Order order) {
        return order.date().format(ORDER_FORMATTER);
    }
}
