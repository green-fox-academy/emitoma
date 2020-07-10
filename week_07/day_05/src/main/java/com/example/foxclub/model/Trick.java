package com.example.foxclub.model;

public class Trick {
    private String name;

    public Trick(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

    public boolean equals(Trick trick) {
        return this.name.equals(trick.name);
    }
}
