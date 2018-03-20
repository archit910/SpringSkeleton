package com.spring.demo;
//

//
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Application {

    public static void main(String[] args)  {
        System.out.println("Archit Chauhan");
        ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        User u = applicationContext.getBean("user" , User.class);
        applicationContext.start();



        CustomPublisher publisher = applicationContext.getBean("customPublisher" , CustomPublisher.class);

        publisher.publish();

    }


}
