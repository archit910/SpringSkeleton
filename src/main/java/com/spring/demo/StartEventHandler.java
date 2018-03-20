package com.spring.demo;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.stereotype.Component;

@Component
public class StartEventHandler implements ApplicationListener <ContextStartedEvent> {
    @Override
    public void onApplicationEvent(ContextStartedEvent event) {
        System.out.println("Context Started");
    }
}
