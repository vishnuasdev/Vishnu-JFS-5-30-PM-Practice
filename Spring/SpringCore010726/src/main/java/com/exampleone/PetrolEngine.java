package com.exampleone;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Qualifier;


@Component
@Primary()
public class PetrolEngine implements Engine {

    @Override
    public void start(){
        System.out.println("Petrol engine started");
    }
}
