package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        Student stud = (Student) SpringConfig().getBean("student");
        Student stud1 = (Student) SpringConfig().getBean("student");

//      Teacher teach = (Teacher) SpringConfig().getBean("teacher");

        stud.display();
//      teach.display();
    }

    public static ApplicationContext SpringConfig(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        return context;
    }
}
