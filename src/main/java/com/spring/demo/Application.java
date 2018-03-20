package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        User u = applicationContext.getBean("user" , User.class);
        System.out.println(u.getX() + " " + u.integer);
        User u1 = applicationContext.getBean("user" , User.class);
        System.out.println(u1.getX() + " " + u1.integer);



    }

}
