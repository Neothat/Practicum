package ru.practicum.sprint02._1_principles.dry;

import java.time.LocalDate;

public record Order(long id, LocalDate date, User user, Courier courier) {
}
