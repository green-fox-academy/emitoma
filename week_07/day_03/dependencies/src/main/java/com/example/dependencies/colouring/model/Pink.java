package com.example.dependencies.colouring.model;

import org.springframework.stereotype.Service;

@Service
public class Pink implements MyColour {
    private String name = "pink";

    @Override
    public void printColor() {
        System.out.println("It is " + this.name + " in color");
    }
}
