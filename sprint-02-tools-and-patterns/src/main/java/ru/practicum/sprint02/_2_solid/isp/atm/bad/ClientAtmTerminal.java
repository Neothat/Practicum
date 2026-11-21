package ru.practicum.sprint02._2_solid.isp.atm.bad;

import ru.practicum.sprint02._2_solid.isp.atm.MaintenanceAdminResponse;

// Клиентскому терминалу админские методы не нужны, но реализовать их всё равно приходится
public class ClientAtmTerminal implements ATMOperations {

    private double balance;

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Недостаточно средств");
        }
        balance -= amount;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public void refillATM(double amount) {
        throw new UnsupportedOperationException("Пополнение банкомата недоступно клиенту");
    }

    @Override
    public MaintenanceAdminResponse performMaintenance() {
        throw new UnsupportedOperationException("Обслуживание недоступно клиенту");
    }
}
