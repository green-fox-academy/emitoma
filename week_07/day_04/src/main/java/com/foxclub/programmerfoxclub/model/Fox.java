package com.foxclub.programmerfoxclub.model;

import java.util.List;

public class Fox {
    private int id = 1;
    private String name;
    private String tricks;
    private Food food;
    private Drink drink;

    public Fox(String name){
        this.name = name;
    }

    public Fox(String name, String tricks, Food food, Drink drink) {
        this.name = name;
        this.tricks = tricks;
        this.food = food;
        this.drink = drink;
        this.id ++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTricks() {
        return tricks;
    }

    public void setTricks(String tricks) {
        this.tricks = tricks;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
