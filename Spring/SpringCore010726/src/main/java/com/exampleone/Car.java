package com.exampleone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class Car {

    @Autowired
    private Engine petrolEngine;

    @Autowired
    @Qualifier("electricEngine")
    private Engine electricEngine;

    public void drive(){
        electricEngine.start();
        petrolEngine.start();
    }
}
