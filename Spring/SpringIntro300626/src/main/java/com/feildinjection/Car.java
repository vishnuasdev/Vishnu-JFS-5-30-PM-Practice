package com.feildinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    @Autowired
    private Engine engine;

    public void drive(){
        engine.start();
        System.out.println("Car is drive");
    }

    public void drived(){
        System.out.println("Car is drive");
    }
}
