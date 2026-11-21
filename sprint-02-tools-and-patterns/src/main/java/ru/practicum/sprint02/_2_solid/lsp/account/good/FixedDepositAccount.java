package ru.practicum.sprint02._2_solid.lsp.account.good;

import java.time.LocalDate;

// Не реализует Withdrawable, поэтому снять деньги с него нельзя даже попытаться
public class FixedDepositAccount extends Account {

    private final LocalDate maturityDate;

    public FixedDepositAccount(LocalDate maturityDate) {
        this.maturityDate = maturityDate;
    }

    public LocalDate getMaturityDate() {
        return maturityDate;
    }
}
