package ru.practicum.sprint02._1_principles.intro.antipattern.good;

import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.util.Properties;

public class AppConfig {

    private final Properties properties = new Properties();

    public AppConfig(String resourceName) {
        try (InputStream in = AppConfig.class.getClassLoader().getResourceAsStream(resourceName)) {
            if (in == null) {
                throw new IllegalStateException("Не найден файл конфигурации: " + resourceName);
            }
            properties.load(in);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public String readJdbcAddress() {
        return properties.getProperty("jdbc.url");
    }

    public String readJdbcUser() {
        return properties.getProperty("jdbc.user");
    }

    public String readJdbcPassword() {
        return properties.getProperty("jdbc.password");
    }
}
