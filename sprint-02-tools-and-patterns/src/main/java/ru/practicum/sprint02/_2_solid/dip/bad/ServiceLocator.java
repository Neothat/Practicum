package ru.practicum.sprint02._2_solid.dip.bad;

import java.util.HashMap;
import java.util.Map;

public final class ServiceLocator {

    private static final Map<Class<?>, Object> SERVICES = new HashMap<>();

    private ServiceLocator() {
    }

    public static <T> void register(Class<T> type, T service) {
        SERVICES.put(type, service);
    }

    public static <T> T get(Class<T> type) {
        Object service = SERVICES.get(type);
        if (service == null) {
            throw new IllegalStateException("Сервис не зарегистрирован: " + type.getName());
        }
        return type.cast(service);
    }
}
