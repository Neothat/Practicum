package ru.practicum.sprint02._2_solid.isp.printer.good;

// МФУ собирается из маленьких интерфейсов, а не тянет на всех один большой
public class OfficeMfu implements Printer, DocumentScanner, Fax {

    @Override
    public void print(String document) {
        System.out.println("МФУ печатает: " + document);
    }

    @Override
    public void scan(String document) {
        System.out.println("МФУ сканирует: " + document);
    }

    @Override
    public void fax(String document) {
        System.out.println("МФУ отправляет факс: " + document);
    }
}
