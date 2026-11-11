package ru.practicum.sprint02._1_principles.dry.good;

public final class Validation {

    private Validation() {
    }

    public static String requireNotBlank(String value, String name) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException(name + " не должен быть пустым");
        }
        return value;
    }
}
