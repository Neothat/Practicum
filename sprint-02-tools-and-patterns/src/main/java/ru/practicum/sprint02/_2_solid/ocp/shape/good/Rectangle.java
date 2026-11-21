package ru.practicum.sprint02._2_solid.ocp.shape.good;

public record Rectangle(double width, double height) implements Shape {

    @Override
    public double calculateArea() {
        return width * height;
    }
}
