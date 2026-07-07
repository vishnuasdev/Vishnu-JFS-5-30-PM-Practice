package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
//        Notification noti = SpringConfig().getBean("notification",Notification.class);
//
//        noti.notifyUser();



    }

    public static ApplicationContext SpringConfig(){
        return new ClassPathXmlApplicationContext("spring.xml");
    }
}
