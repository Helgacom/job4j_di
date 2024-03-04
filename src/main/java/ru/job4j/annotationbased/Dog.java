package ru.job4j.annotationbased;

import jakarta.annotation.PostConstruct;
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

    @PostConstruct
    public void postConstruct() {
        System.out.println("bean Dog method postConstruct()");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("bean Dog method preDestroy()");
    }
}
