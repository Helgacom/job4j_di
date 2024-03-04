package ru.job4j.xmlbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppXmlBased {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:xml-based.xml");
        Person person = context.getBean("person", Person.class);
        person.printNamesPets();
    }
}