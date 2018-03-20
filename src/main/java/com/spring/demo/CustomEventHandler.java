package com.spring.demo;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class CustomEventHandler implements ApplicationListener <CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent event) {
       event.check();
    }
}
