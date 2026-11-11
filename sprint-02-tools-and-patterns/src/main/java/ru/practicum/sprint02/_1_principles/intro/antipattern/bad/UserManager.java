package ru.practicum.sprint02._1_principles.intro.antipattern.bad;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

// God Object: пользователи, почта, скидки, отчёты и экспорт - всё в одном классе
public class UserManager {

    private final List<String> users = new ArrayList<>();
    private final String smtpHost = "smtp.example.com";
    private final BigDecimal vipDiscount = new BigDecimal("0.15");

    public void registerUser(String username) {
        users.add(username);
        sendEmail(username, "Добро пожаловать!");
    }

    public void sendEmail(String username, String text) {
        System.out.printf("[%s] %s: %s%n", smtpHost, username, text);
    }

    public BigDecimal calculateDiscount(String username, BigDecimal price) {
        return username.startsWith("vip_") ? price.multiply(vipDiscount) : BigDecimal.ZERO;
    }

    public String buildMonthlyReport() {
        return "Пользователей: " + users.size();
    }

    public String exportToCsv() {
        return String.join(";", users);
    }
}
