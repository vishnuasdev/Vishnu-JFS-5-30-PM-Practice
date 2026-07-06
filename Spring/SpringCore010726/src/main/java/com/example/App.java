package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
            Car car = new AnnotationConfigApplicationContext(AppConfig.class).getBean(Car.class);
            car.drive();
    }
}
