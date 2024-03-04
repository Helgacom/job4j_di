package ru.job4j.xmlbased;

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

    public void preDestroy() {
        System.out.println("bean Dog method preDestroy()");
    }
}
