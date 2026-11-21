package ru.practicum.sprint02._2_solid.isp.printer.bad;

public interface MultifunctionDevice {

    void print(String document);

    void scan(String document);

    void fax(String document);
}
