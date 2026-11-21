package ru.practicum.sprint02._2_solid.lsp.account.good;

public class Account {

    protected double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}
