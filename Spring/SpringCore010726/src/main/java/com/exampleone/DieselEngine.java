package com.exampleone;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Qualifier;

@Component
@Qualifier("dieselEngine")
public class DieselEngine implements Engine {

    @Override
    public void start(){
        System.out.println("Diesel engine started");
    }
}
