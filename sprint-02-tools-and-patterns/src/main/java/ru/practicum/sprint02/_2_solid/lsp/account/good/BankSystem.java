package ru.practicum.sprint02._2_solid.lsp.account.good;

import java.time.LocalDate;

public class BankSystem {

    public void processWithdrawal(Withdrawable account, double amount) {
        account.withdraw(amount);
    }

    public static void main(String[] args) {
        BankSystem bank = new BankSystem();

        SavingsAccount savings = new SavingsAccount();
        savings.deposit(5000);
        bank.processWithdrawal(savings, 1000);

        FixedDepositAccount deposit = new FixedDepositAccount(LocalDate.now().plusYears(1));
        deposit.deposit(5000);
        // bank.processWithdrawal(deposit, 1000) не скомпилируется: ошибка видна сразу, а не в рантайме
    }
}
