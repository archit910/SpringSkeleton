package com.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

//@Component
public class CustomEvent extends ApplicationEvent{

    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */

    public CustomEvent(Object source) {
        super(source);

        System.out.println("This is My Custom Event Fired !! ");

    }

    @Override
    public String toString() {
        return "My Custom Event";
    }
}
