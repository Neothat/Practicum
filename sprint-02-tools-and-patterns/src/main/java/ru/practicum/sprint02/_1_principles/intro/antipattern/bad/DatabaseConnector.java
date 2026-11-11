package ru.practicum.sprint02._1_principles.intro.antipattern.bad;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Hard code: чтобы сменить адрес БД, нужно править код и пересобирать проект
public class DatabaseConnector {

    public Connection connect() throws SQLException {
        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/tools_and_patterns", "postgres", "postgres");
    }
}
