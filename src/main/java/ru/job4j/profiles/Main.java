package ru.job4j.profiles;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("devAlfa");
        context.register(Config.class);
        context.refresh();
        Dog dog = context.getBean(Dog.class);
        System.out.println(dog.print());
    }
}
