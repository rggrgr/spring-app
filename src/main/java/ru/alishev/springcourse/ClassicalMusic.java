package ru.alishev.springcourse;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class ClassicalMusic implements Music {
    @Override
    public String getSong(){
        return "Hungarian Rhapsody";
    }

    @PostConstruct
    public void doMyInit(){
        System.out.println("Do my init");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Do my destruct");
    }
}
