package com.spring.demo;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class CustomPublisher implements ApplicationEventPublisherAware {
    ApplicationEventPublisher publisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        publisher = applicationEventPublisher;
    }

    public void publish(CustomEvent event){
        publisher.publishEvent(event);
    }
}
