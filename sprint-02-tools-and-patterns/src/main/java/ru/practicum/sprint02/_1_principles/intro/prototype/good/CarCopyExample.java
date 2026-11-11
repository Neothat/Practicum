package ru.practicum.sprint02._1_principles.intro.prototype.good;

public class CarCopyExample {

    public void run(Car original) {
        testDrive(original.copy());
    }

    private void testDrive(Car car) {
        car.increaseSpeed(100);
    }
}
