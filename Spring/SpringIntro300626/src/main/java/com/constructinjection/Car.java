package com.constructinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.constructinjection.Engine;

@Component
public class Car {

    private final Engine engine;

    public Car(Engine engine){
        this.engine = engine;
    }

    public String drive(){
        System.out.println(engine.start());
        return "Car is driving";
    }

}
