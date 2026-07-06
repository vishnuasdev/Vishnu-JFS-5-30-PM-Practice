package com.constructinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class App {

    public static void main(String[] args) {
        Car car = SpringContext().getBean(Car.class);
        System.out.println(car.drive());
    }

    public static ApplicationContext SpringContext(){
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        return context;
    }
}
