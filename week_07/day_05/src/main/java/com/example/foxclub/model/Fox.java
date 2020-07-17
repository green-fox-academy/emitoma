package com.example.foxclub.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Fox {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany
    private List<Trick> trickList = new ArrayList<>();

    @ManyToOne
    private Food food;

    @ManyToOne
    private Drink drink;

    @OneToOne
    private User owner;


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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public void learnTricks(Trick trick) {
        this.trickList.add(trick);
    }

    public int numberOfTricks() {
        return this.trickList.size();
    }
}
