package ru.practicum.sprint02._2_solid.lsp.bird.bad;

public class Penguin extends Bird {

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Пингвины не умеют летать!");
    }
}
