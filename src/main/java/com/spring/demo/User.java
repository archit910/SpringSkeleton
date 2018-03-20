package com.spring.demo;

import org.springframework.stereotype.Component;

@Component
public class User {
    private Integer x ;


    static Integer integer = 0;
    User(){integer ++;}
    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {

        this.x = x;
    }
}
