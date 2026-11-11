package ru.practicum.sprint02._1_principles.bduf;

import java.time.LocalDate;
import java.util.UUID;

public record Loan(UUID id, long bookId, long readerId, LocalDate issuedAt, LocalDate dueAt, LocalDate returnedAt) {

    public boolean isActive() {
        return returnedAt == null;
    }

    public Loan returned(LocalDate date) {
        return new Loan(id, bookId, readerId, issuedAt, dueAt, date);
    }
}
