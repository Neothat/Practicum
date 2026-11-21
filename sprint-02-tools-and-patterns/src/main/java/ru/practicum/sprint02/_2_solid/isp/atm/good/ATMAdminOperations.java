package ru.practicum.sprint02._2_solid.isp.atm.good;

import ru.practicum.sprint02._2_solid.isp.atm.MaintenanceAdminResponse;

public interface ATMAdminOperations {

    void refillATM(double amount);

    MaintenanceAdminResponse performMaintenance();
}
