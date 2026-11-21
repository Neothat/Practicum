package ru.practicum.sprint02._2_solid.ocp.shape.good;

public record Circle(double radius) implements Shape {

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
