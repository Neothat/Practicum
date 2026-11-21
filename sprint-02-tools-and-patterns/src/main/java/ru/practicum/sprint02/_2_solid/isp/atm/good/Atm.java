package ru.practicum.sprint02._2_solid.isp.atm.good;

import ru.practicum.sprint02._2_solid.isp.atm.MaintenanceAdminResponse;

// Сам банкомат умеет всё, но каждый клиент видит его только через свой интерфейс
public class Atm implements ATMClientOperations, ATMAdminOperations {

    private double cash;
    private double balance;

    @Override
    public void deposit(double amount) {
        balance += amount;
        cash += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Недостаточно средств на счёте");
        }
        if (amount > cash) {
            throw new IllegalStateException("В банкомате недостаточно наличных");
        }
        balance -= amount;
        cash -= amount;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public void refillATM(double amount) {
        cash += amount;
    }

    @Override
    public MaintenanceAdminResponse performMaintenance() {
        return new MaintenanceAdminResponse(cash > 0, cash);
    }
}
