package com.feildinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class App
{
    @Autowired
    private Engine engine;

    @Autowired
    private Car car;

    public static void main( String[] args )
    {
        //Method 1: Call through car class Object Called
        System.out.println("Method 1: Call through car class Object Called");
        Car car = SpringContainer().getBean(Car.class);
        car.drive();

        System.out.println("\nMethod 2: Call through Main App class");
        //Method 2: Call through Main App class
        AppClass();


    }
    public static ApplicationContext SpringContainer(){
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        return context;
    }

    public static void AppClass(){
        App app = SpringContainer().getBean(App.class);
        app.engine.start();
        app.car.drived();
    }
}
