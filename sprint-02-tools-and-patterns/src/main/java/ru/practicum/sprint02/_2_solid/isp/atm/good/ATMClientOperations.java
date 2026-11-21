package ru.practicum.sprint02._2_solid.isp.atm.good;

public interface ATMClientOperations {

    void deposit(double amount);

    void withdraw(double amount);

    double checkBalance();
}
