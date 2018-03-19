package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {

//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml")
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(Config.class);
       UserServices obj = applicationContext.getBean("userServices" , UserServices.class);
       obj.method1();
    }
}
