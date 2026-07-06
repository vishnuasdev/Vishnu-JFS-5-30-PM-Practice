package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        Student stud = SpringConfig().getBean("student",Student.class);

        stud.display();
    }

    public static ApplicationContext SpringConfig(){
        return new ClassPathXmlApplicationContext("spring.xml");
    }
}
