package ru.practicum.sprint02._1_principles.occam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

// Один запрос по id: вполне хватает JDBC из JDK, Hibernate/Spring Data тут лишние. Нужен только драйвер БД
public class UserProvider implements AutoCloseable {

    private static final String FIND_BY_ID = "SELECT id, username, email FROM users WHERE id = ?";

    private final Connection connection;

    public UserProvider(String connectionUrl, String username, String password) throws SQLException {
        this.connection = DriverManager.getConnection(connectionUrl, username, password);
    }

    public Optional<User> findUserById(long userId) throws SQLException {
        try (PreparedStatement stmt = connection.prepareStatement(FIND_BY_ID)) {
            stmt.setLong(1, userId);
            try (ResultSet rs = stmt.executeQuery()) {
                if (!rs.next()) {
                    return Optional.empty();
                }
                return Optional.of(new User(
                        rs.getLong("id"),
                        rs.getString("username"),
                        rs.getString("email")
                ));
            }
        }
    }

    @Override
    public void close() throws SQLException {
        connection.close();
    }
}
