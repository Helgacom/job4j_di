package ru.job4j.annotationbased;

import org.springframework.stereotype.Component;

@Component
public class BirdFactory {
    public Canary getCanary(String name) {
        return new Canary(name);
    }

    public Parrot getParrot(String name) {
        return new Parrot(name);
    }
}
