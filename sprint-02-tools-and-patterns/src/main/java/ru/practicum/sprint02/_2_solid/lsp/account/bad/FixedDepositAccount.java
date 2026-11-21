package ru.practicum.sprint02._2_solid.lsp.account.bad;

// Наследник ломает контракт: базовый withdraw работает, а этот падает
public class FixedDepositAccount extends Account {

    @Override
    public void withdraw(double amount) {
        throw new UnsupportedOperationException("Снятие с фиксированного депозита недоступно!");
    }
}
