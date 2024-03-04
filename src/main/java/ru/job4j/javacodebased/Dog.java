package ru.job4j.javacodebased;

import jakarta.annotation.PreDestroy;

public class Dog {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public Dog() {
    }

    public String getName() {
        return name;
    }


    public void postConstruct() {
        System.out.println("bean Dog method postConstruct()");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("bean Dog method preDestroy()");
    }
}
