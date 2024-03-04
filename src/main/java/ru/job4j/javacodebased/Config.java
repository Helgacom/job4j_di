package ru.job4j.javacodebased;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "ru.job4j.javacodebased")
@PropertySource("classpath:application.properties")
public class Config {
    @Value("${parrot.name:Kesha}")
    private String parrotName;
    @Value("${canary.name:Roza}")
    private String canaryName;
    @Value("${cat.name:simpleCat}")
    private String catName;

    @Value("${dog.name:AlfaDog}")
    private String dogName;

    @Bean
    public BirdFactory birdFactory() {
        return new BirdFactory();
    }

    @Bean
    public Parrot parrot() {
        return birdFactory().getParrot(parrotName);
    }

    @Bean
    public Canary canary() {
        return birdFactory().getCanary(canaryName);
    }

    @Bean (
            name = "myDog",
            initMethod = "postConstruct"
    )
    public Dog dog() {
        return new Dog(dogName);
    }

    @Bean
    public Cat cat() {
        return Cat.createCat(catName);
    }
}
