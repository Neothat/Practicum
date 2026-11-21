package ru.practicum.sprint02._2_solid.ocp.shape.good;

import java.util.List;

// Новая фигура: отдельный класс, ShapeCalculator без изменений. Площадь по формуле шнурования (Гаусса)
public record Polygon(List<Point> vertices) implements Shape {

    public record Point(double x, double y) {
    }

    public Polygon {
        if (vertices.size() < 3) {
            throw new IllegalArgumentException("У многоугольника минимум 3 вершины");
        }
        vertices = List.copyOf(vertices);
    }

    @Override
    public double calculateArea() {
        double sum = 0;
        for (int i = 0; i < vertices.size(); i++) {
            Point current = vertices.get(i);
            Point next = vertices.get((i + 1) % vertices.size());
            sum += current.x() * next.y() - next.x() * current.y();
        }
        return Math.abs(sum) / 2;
    }
}
