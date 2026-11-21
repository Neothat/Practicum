package ru.practicum.sprint02._2_solid.isp.printer.bad;

public class SimplePrinter implements MultifunctionDevice {

    @Override
    public void print(String document) {
        System.out.println("Печать документа: " + document);
    }

    @Override
    public void scan(String document) {
        throw new UnsupportedOperationException("Сканирование не поддерживается");
    }

    @Override
    public void fax(String document) {
        throw new UnsupportedOperationException("Факс не поддерживается");
    }
}
