package com.example.foxclub.service;

import com.example.foxclub.model.Drink;
import com.example.foxclub.model.Food;
import com.example.foxclub.model.Fox;
import com.example.foxclub.model.Trick;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class FoxService {
    private List<Fox> foxList;
    private List<Food> foodList;
    private List<Drink> drinkList;
    private List<Trick> trickList;

    public FoxService() {
        this.foxList = new ArrayList<>();
        this.foodList = new ArrayList<>();
        this.drinkList = new ArrayList<>();
        this.trickList = new ArrayList<>();
        addDefaultFoods();
        addDefaultDrinks();
        addDefaultTricks();
        addDefaultFox();

    }

    public void addDefaultFox() {
        this.foxList.add(new Fox("Mr.Green", foodList.get(0), drinkList.get(2)));

    }

    public void addDefaultFoods() {
        this.foodList.add(new Food("Pizza"));
        this.foodList.add(new Food("Sandwich"));
        this.foodList.add(new Food("Salad"));
    }

    public void addDefaultDrinks() {
        this.drinkList.add(new Drink("Water"));
        this.drinkList.add(new Drink("Lemonade"));
        this.drinkList.add(new Drink("Coke"));
    }

    public void addDefaultTricks() {
        this.trickList.add(new Trick("Code in Java"));
        this.trickList.add(new Trick("Jump up high"));
        this.trickList.add(new Trick("Steal chickens"));

    }

    public void add(Fox fox) {
        this.foxList.add(fox);
    }

    public Optional<Fox> findFox(String name) {
        return foxList.stream()
                .filter(fox -> fox.getName().equals(name))
                .findFirst();
    }

    public List<Fox> getFoxList() {
        return foxList;
    }

    public void setFoxList(List<Fox> foxList) {
        this.foxList = foxList;
    }

    public List<Food> getFoodList() {
        return foodList;
    }

    public void setFoodList(List<Food> foodList) {
        this.foodList = foodList;
    }

    public List<Drink> getDrinkList() {
        return drinkList;
    }

    public void setDrinkList(List<Drink> drinkList) {
        this.drinkList = drinkList;
    }

    public List<Trick> getTrickList() {
        return trickList;
    }

    public void setTrickList(List<Trick> trickList) {
        this.trickList = trickList;
    }

    public List<Trick> getNotLearntTricks(Fox fox) {
        List<Trick> foxTricks = fox.getTrickList();

        List<Trick> filteredTricks = new ArrayList<>();

        for (Trick trick : trickList) {
            boolean found = false;
            for (Trick foxTrick : foxTricks) {
                if (trick.equals(foxTrick)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                filteredTricks.add(trick);
            }
        }


        return filteredTricks;
    }
}
