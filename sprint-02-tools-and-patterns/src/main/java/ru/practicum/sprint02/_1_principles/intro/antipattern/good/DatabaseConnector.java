package ru.practicum.sprint02._1_principles.intro.antipattern.good;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {

    private final AppConfig configuration;

    public DatabaseConnector(AppConfig configuration) {
        this.configuration = configuration;
    }

    public Connection connect() throws SQLException {
        return DriverManager.getConnection(
                configuration.readJdbcAddress(),
                configuration.readJdbcUser(),
                configuration.readJdbcPassword()
        );
    }
}
