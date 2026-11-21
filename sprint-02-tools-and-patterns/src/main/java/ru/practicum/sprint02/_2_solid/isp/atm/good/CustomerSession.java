package ru.practicum.sprint02._2_solid.isp.atm.good;

// Зависит только от клиентских операций. Новый админский метод сюда никак не повлияет
public class CustomerSession {

    private final ATMClientOperations atm;

    public CustomerSession(ATMClientOperations atm) {
        this.atm = atm;
    }

    public boolean withdrawIfEnough(double amount) {
        if (atm.checkBalance() < amount) {
            return false;
        }
        atm.withdraw(amount);
        return true;
    }
}
