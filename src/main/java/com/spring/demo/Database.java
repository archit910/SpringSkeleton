package com.spring.demo;

import org.springframework.beans.factory.annotation.Required;

public class Database {
    private Integer port;
    private String name;

    public Integer getPort() {
        return port;
    }
    @Required
    public void setPort(Integer port) {
        this.port = port;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
