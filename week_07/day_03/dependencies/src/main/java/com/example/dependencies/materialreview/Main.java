package com.example.dependencies.materialreview;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(new ElectricEngine());
        System.out.println("Car 1: " + car1.drive());

        Car car2 = new Car(new CombustionEngine());
        System.out.println("Car 2: " + car2.drive());

    }
}
