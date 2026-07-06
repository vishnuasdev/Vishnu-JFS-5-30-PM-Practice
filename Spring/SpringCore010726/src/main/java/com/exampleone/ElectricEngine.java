package com.exampleone;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Qualifier;

@Component
public class ElectricEngine implements Engine {

    @Override
    public  void start(){
        System.out.println("Electric Engine started");
    }
}
