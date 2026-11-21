package ru.practicum.sprint02._2_solid.lsp.bird.good;

import java.util.List;

// Двигаться умеет любая птица, а летать просим только тех, кто реально умеет
public class BirdShow {

    public void parade(List<? extends Bird> birds) {
        birds.forEach(Bird::move);
    }

    public void airShow(List<? extends Flying> flyers) {
        flyers.forEach(Flying::fly);
    }
}
