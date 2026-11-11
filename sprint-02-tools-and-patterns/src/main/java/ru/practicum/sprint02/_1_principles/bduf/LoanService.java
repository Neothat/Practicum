package ru.practicum.sprint02._1_principles.bduf;

import java.time.LocalDate;
import java.util.NoSuchElementException;
import java.util.UUID;

public class LoanService {

    static final int LOAN_DAYS = 14;
    static final int MAX_ACTIVE_LOANS = 3;

    private final LoanRepository repository;

    public LoanService(LoanRepository repository) {
        this.repository = repository;
    }

    public Loan issue(long bookId, long readerId) {
        if (repository.findActiveByBook(bookId).isPresent()) {
            throw new IllegalStateException("Книга уже выдана: " + bookId);
        }
        if (repository.findActiveByReader(readerId).size() >= MAX_ACTIVE_LOANS) {
            throw new IllegalStateException("У читателя уже " + MAX_ACTIVE_LOANS + " книги");
        }

        LocalDate today = LocalDate.now();
        Loan loan = new Loan(UUID.randomUUID(), bookId, readerId, today, today.plusDays(LOAN_DAYS), null);
        repository.save(loan);
        return loan;
    }

    public Loan returnBook(UUID loanId) {
        Loan loan = repository.findById(loanId)
                .filter(Loan::isActive)
                .orElseThrow(() -> new NoSuchElementException("Активная выдача не найдена: " + loanId));

        Loan returned = loan.returned(LocalDate.now());
        repository.save(returned);
        return returned;
    }
}
