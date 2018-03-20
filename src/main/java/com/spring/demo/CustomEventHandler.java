package com.spring.demo;

import org.springframework.context.ApplicationListener;

public class CustomEventHandler implements ApplicationListener <CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent event) {
        System.out.println(event.toString());
    }
}
