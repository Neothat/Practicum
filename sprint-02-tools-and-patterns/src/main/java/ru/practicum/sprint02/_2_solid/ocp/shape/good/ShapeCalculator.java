package ru.practicum.sprint02._2_solid.ocp.shape.good;

import java.util.List;

public class ShapeCalculator {

    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    public double totalArea(List<Shape> shapes) {
        return shapes.stream()
                .mapToDouble(Shape::calculateArea)
                .sum();
    }
}
