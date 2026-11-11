package ru.practicum.sprint02._1_principles.intro.prototype.bad;

public class Car {

    private int currentSpeed;

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void increaseSpeed(int speed) {
        this.currentSpeed += speed;
    }
}
