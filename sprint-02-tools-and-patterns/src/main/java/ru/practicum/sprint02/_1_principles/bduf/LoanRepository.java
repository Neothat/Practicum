package ru.practicum.sprint02._1_principles.bduf;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface LoanRepository {

    void save(Loan loan);

    Optional<Loan> findById(UUID id);

    Optional<Loan> findActiveByBook(long bookId);

    List<Loan> findActiveByReader(long readerId);
}
