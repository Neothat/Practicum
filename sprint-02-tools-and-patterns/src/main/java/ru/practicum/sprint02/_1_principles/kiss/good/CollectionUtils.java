package ru.practicum.sprint02._1_principles.kiss.good;

import java.util.Collection;

public final class CollectionUtils {

    private CollectionUtils() {
    }

    // iterator().next() сам бросит NoSuchElementException на пустой коллекции
    public static <T> T getFirst(Collection<T> collection) {
        return collection.iterator().next();
    }
}
