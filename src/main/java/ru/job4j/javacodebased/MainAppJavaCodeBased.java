package ru.job4j.javacodebased;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAppJavaCodeBased {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ct = new AnnotationConfigApplicationContext(Config.class);
        Person person = ct.getBean("myPerson", Person.class);
        person.printNamesPets();
        ct.close();
    }
}
