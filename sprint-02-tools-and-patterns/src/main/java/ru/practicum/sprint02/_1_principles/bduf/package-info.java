/**
 * BDUF: сначала план, потом код. Подходит, когда требования чёткие и не меняются.
 *
 * <p>Требования (библиотека, выдача книг):
 * <ul>
 *   <li>книга выдаётся на 14 дней</li>
 *   <li>у читателя одновременно не больше 3 книг</li>
 *   <li>уже выданную книгу взять нельзя</li>
 * </ul>
 *
 * <p>План:
 * <ul>
 *   <li>{@link ru.practicum.sprint02._1_principles.bduf.Loan} - выдача: книга, читатель, даты выдачи, срока и возврата</li>
 *   <li>{@link ru.practicum.sprint02._1_principles.bduf.LoanRepository} - хранение выдач</li>
 *   <li>{@link ru.practicum.sprint02._1_principles.bduf.LoanService} - правила выдачи и возврата</li>
 * </ul>
 * Код ниже будет реализацией этого плана, без лишних деталей сверх него
 */
package ru.practicum.sprint02._1_principles.bduf;
