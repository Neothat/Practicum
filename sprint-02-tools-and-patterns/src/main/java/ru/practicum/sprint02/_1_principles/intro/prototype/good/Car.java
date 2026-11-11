package ru.practicum.sprint02._1_principles.intro.prototype.good;

public interface Car {

    int getCurrentSpeed();

    void increaseSpeed(int speed);

    Car copy();
}
