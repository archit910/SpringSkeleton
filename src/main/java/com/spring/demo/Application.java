package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
//
//        Database database = applicationContext.getBean("databaseBean" , Database.class);
//        System.out.println(database.getPort() + " " + database.getName());

        Restraunt restraunt = applicationContext.getBean("restraunt" , Restraunt.class);
        restraunt.getCoffee().prepareHotDrink();
        restraunt.getTea().prepareHotDrink();
    }
}
