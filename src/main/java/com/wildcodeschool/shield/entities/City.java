package com.wildcodeschool.shield.entities;

import org.springframework.stereotype.Component;

@Component
public class City {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
