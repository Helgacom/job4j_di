package ru.job4j.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({"default", "devComponent"})
public class Dog  {
    private String name = "DogDefault";
    public Dog() {

    }

    public Dog(String name) {
        this.name = name;
    }

    public String print() {
        return "Dog name = %s".formatted(name);
    }
}
