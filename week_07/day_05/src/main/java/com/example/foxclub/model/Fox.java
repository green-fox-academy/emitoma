package com.example.foxclub.model;

import java.util.ArrayList;
import java.util.List;

public class Fox {
    private String name;

    private List<Trick> trickList;
    private Food food;
    private Drink drink;

    public Fox() {
        this.trickList = new ArrayList<>();
    }

    public Fox(String name, Food food, Drink drink) {
        this.name = name;
        this.trickList = new ArrayList<>();
        this.food = food;
        this.drink = drink;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Trick> getTrickList() {
        return trickList;
    }

    public void setTrickList(List<Trick> trickList) {
        this.trickList = trickList;
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

    public void learnTricks(Trick trick) {
        this.trickList.add(trick);
    }

    public int numberOfTricks() {
        return this.trickList.size();
    }
}
