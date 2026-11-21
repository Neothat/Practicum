package ru.practicum.sprint02._2_solid.lsp.bird.bad;

import java.util.List;

// Работает с Bird, но упадёт, как только в списке окажется пингвин
public class BirdShow {

    public void start(List<Bird> birds) {
        birds.forEach(Bird::fly);
    }
}
