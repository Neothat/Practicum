package ru.practicum.sprint02._1_principles.bduf;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

public class InMemoryLoanRepository implements LoanRepository {

    private final Map<UUID, Loan> loans = new HashMap<>();

    @Override
    public void save(Loan loan) {
        loans.put(loan.id(), loan);
    }

    @Override
    public Optional<Loan> findById(UUID id) {
        return Optional.ofNullable(loans.get(id));
    }

    @Override
    public Optional<Loan> findActiveByBook(long bookId) {
        return loans.values().stream()
                .filter(Loan::isActive)
                .filter(loan -> loan.bookId() == bookId)
                .findFirst();
    }

    @Override
    public List<Loan> findActiveByReader(long readerId) {
        return loans.values().stream()
                .filter(Loan::isActive)
                .filter(loan -> loan.readerId() == readerId)
                .toList();
    }
}
