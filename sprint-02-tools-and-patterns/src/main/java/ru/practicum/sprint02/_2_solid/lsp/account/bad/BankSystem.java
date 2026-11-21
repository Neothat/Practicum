package ru.practicum.sprint02._2_solid.lsp.account.bad;

public class BankSystem {

    public void processWithdrawal(Account account, double amount) {
        account.withdraw(amount);
    }

    public static void main(String[] args) {
        BankSystem bank = new BankSystem();
        bank.processWithdrawal(new Account(), 1000);
        bank.processWithdrawal(new FixedDepositAccount(), 1000);
    }
}
