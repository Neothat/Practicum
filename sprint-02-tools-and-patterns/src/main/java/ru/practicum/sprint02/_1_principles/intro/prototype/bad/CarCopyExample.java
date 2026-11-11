package ru.practicum.sprint02._1_principles.intro.prototype.bad;

// Копирование знает внутреннее устройство Car
// C интерфейсом так уже не получится
public class CarCopyExample {

    public void run(Car original) {
        Car copied = new Car();
        copied.increaseSpeed(original.getCurrentSpeed());
        testDrive(copied);
    }

    private void testDrive(Car car) {
        car.increaseSpeed(100);
    }
}
