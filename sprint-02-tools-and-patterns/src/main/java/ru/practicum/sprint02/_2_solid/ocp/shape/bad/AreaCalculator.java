package ru.practicum.sprint02._2_solid.ocp.shape.bad;

// Чтобы добавить многоугольник, придётся лезть в этот switch
public class AreaCalculator {

    public double calculateArea(String shapeType, double... parameters) {
        return switch (shapeType) {
            case "circle" -> Math.PI * parameters[0] * parameters[0];
            case "rectangle" -> parameters[0] * parameters[1];
            case "triangle" -> 0.5 * parameters[0] * parameters[1];
            default -> throw new IllegalArgumentException("Неизвестный тип фигуры: " + shapeType);
        };
    }
}
