package com.example.dependencies.materialreview;

public class Car {

    private Engine engine;

    public Car(Engine engine) {

        this.engine = engine;
    }

    public String drive() {
        return engine.sound();
    }
}
