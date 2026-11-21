package ru.practicum.sprint02._2_solid.lsp.account.good;

public class SavingsAccount extends Account implements Withdrawable {

    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Недостаточно средств");
        }
        balance -= amount;
        System.out.println("Снятие суммы: " + amount);
    }
}
