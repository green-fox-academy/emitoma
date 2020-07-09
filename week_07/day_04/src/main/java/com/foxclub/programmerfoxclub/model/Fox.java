package com.foxclub.programmerfoxclub.model;

import java.util.List;

public class Fox {
    private String name;
    private List<Trick> tricks;
    private Food food;
    private Drink drink;

    public Fox() {
    }

    public Fox(String name) {
        this.name = name;
    }

    public Fox(String name, Food food, Drink drink) {
        this.name = name;
        this.food = food;
        this.drink = drink;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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



    public List<Trick> getTricks() {
        return tricks;
    }

    public void setTricks(List<Trick> tricks) {
        this.tricks = tricks;
    }

    public void learnTrick(Trick trick) {
        this.tricks.add(trick);
    }
}
