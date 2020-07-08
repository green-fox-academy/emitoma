package com.example.dependencies.colouring.model;

public class Red implements MyColour {
    private String name;

    public Red() {
        this.name = "red";
    }

    @Override
    public void printColor() {
        System.out.println("It is " + this.name + " in color");

    }
}
