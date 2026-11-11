package ru.practicum.sprint02._1_principles.yagni.good;

public class Customer {

    private final String name;
    private final int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sendEmail(String subject, String body) {
        System.out.printf("To %s (%d): %s - %s%n", name, age, subject, body);
    }
}
