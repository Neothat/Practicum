package ru.practicum.sprint02._1_principles.yagni.bad;

// Поле active final и всегда true и проверка в sendEmail никогда не сработает
public class Customer {

    private final String name;
    private final int age;
    private final boolean active;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
        this.active = true;
    }

    public void sendEmail(String subject, String body) {
        if (!active) {
            throw new IllegalStateException("Пользователь заблокирован");
        }
        System.out.printf("To %s (%d): %s - %s%n", name, age, subject, body);
    }
}
