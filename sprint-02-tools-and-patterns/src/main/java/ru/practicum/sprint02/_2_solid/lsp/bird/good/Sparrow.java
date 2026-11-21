package ru.practicum.sprint02._2_solid.lsp.bird.good;

public class Sparrow extends Bird implements Flying {

    @Override
    public void move() {
        fly();
    }

    @Override
    public void fly() {
        System.out.println("Воробей летает");
    }
}
