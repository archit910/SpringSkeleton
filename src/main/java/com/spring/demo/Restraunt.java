package com.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Restraunt {
    HotDrink tea;
    HotDrink coffee;

    public HotDrink getTea() {
        return tea;
    }
    @Autowired
    @Resource(name = "tea")
    public void setTea(HotDrink tea) {
        this.tea = tea;
    }

    public HotDrink getCoffee() {
        return coffee;
    }
    @Autowired
    @Resource(name = "coffee")
    public void setCoffee(HotDrink coffee) {
        this.coffee = coffee;
    }
}
