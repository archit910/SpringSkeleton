package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Application {
    public static void main(String[] args) {

//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml")
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(Config.class);
       UserServices obj = applicationContext.getBean("userServices" , UserServices.class);
       obj.method1();
       try {
           obj.method2();
       }
       catch (IOException ex) {
           System.out.println("This is the message " + ex.getMessage());
       }
       obj.method3();
    }
}
