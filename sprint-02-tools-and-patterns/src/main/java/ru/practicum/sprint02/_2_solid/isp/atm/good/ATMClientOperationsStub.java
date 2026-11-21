package ru.practicum.sprint02._2_solid.isp.atm.good;

// Стаб для тестов CustomerSession: только три метода, админские реализовывать не нужно
public class ATMClientOperationsStub implements ATMClientOperations {

    private final double balance;

    public ATMClientOperationsStub(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        System.out.println("Стаб: пополнение на сумму " + amount);
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Стаб: снятие на сумму " + amount);
    }

    @Override
    public double checkBalance() {
        return balance;
    }
}
