package ru.practicum.sprint02._1_principles.kiss.bad;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class CollectionUtils {

    private CollectionUtils() {
    }

    public static <T> T getFirst(Collection<T> collection) {
        int size = collection.size();
        if (size > 0) {
            Iterator<T> iterator = collection.iterator();
            if (iterator.hasNext()) {
                return iterator.next();
            }
        }
        throw new NoSuchElementException();
    }
}
