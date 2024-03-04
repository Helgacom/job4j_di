package ru.job4j.annotationbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppAnnotationBased {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:annotation-based.xml");
        Person person = context.getBean("person", Person.class);
        person.printNamesPets();
    }
}
