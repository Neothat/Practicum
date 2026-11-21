package ru.practicum.sprint02._2_solid.ocp.shape.good;

public record Triangle(double base, double height) implements Shape {

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}
