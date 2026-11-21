package ru.practicum.sprint02._2_solid.isp.atm.bad;

import ru.practicum.sprint02._2_solid.isp.atm.MaintenanceAdminResponse;

// Один интерфейс на двух разных клиентов: владельца карты и инкассатора
public interface ATMOperations {

    void deposit(double amount);

    void withdraw(double amount);

    double checkBalance();

    void refillATM(double amount);

    MaintenanceAdminResponse performMaintenance();
}
