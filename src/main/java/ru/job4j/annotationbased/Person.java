package ru.job4j.annotationbased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Person {

    private String name;
    private Dog dog;
    private Cat cat;
    private Canary canary;
    private Parrot parrot;

    public Person() {
    }

    @Autowired
    public Person(@Value("Man") String name, Dog dog, Cat cat, Canary canary, Parrot parrot) {
        this.name = name;
        this.dog = dog;
        this.cat = cat;
        this.canary = canary;
        this.parrot = parrot;
    }

    public void printNamesPets() {
        System.out.println("Person Name = " + name);
        System.out.println("dog = " + dog.getName());
        System.out.println("cat = " + cat.getName());
        System.out.println("canary = " + canary.getName());
        System.out.println("parrot = " + parrot.getName());
    }
}
