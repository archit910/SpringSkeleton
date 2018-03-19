package com.spring.demo;

import org.springframework.stereotype.Component;

@Component
public class Coffee implements HotDrink {
    @Override
    public void prepareHotDrink() {

        System.out.println("Preparing Coffee");

    }
}

