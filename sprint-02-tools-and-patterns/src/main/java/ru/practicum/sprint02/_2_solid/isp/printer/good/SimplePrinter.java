package ru.practicum.sprint02._2_solid.isp.printer.good;

public class SimplePrinter implements Printer {

    @Override
    public void print(String document) {
        System.out.println("Печать документа: " + document);
    }
}
