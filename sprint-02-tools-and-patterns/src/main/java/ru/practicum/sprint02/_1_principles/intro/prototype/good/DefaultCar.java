package ru.practicum.sprint02._1_principles.intro.prototype.good;

public class DefaultCar implements Car {

    private int currentSpeed;

    @Override
    public int getCurrentSpeed() {
        return currentSpeed;
    }

    @Override
    public void increaseSpeed(int speed) {
        this.currentSpeed += speed;
    }

    @Override
    public Car copy() {
        DefaultCar duplicate = new DefaultCar();
        duplicate.currentSpeed = this.currentSpeed;
        return duplicate;
    }
}
