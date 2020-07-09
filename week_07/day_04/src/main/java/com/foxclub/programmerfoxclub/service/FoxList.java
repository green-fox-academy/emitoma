package com.foxclub.programmerfoxclub.service;

import com.foxclub.programmerfoxclub.model.Drink;
import com.foxclub.programmerfoxclub.model.Food;
import com.foxclub.programmerfoxclub.model.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class FoxList {
    List<Fox> foxList = new ArrayList<>(Arrays.asList(
            new Fox("Karak", Food.PIZZA, Drink.LEMONADE),
            new Fox("Vuk",  Food.PIZZA, Drink.WATER)
    ));


    public void add(Fox fox) {
        foxList.add(fox);
    }

    public List<Fox> getFoxList() {
        return foxList;
    }

    public void setFoxList(List<Fox> foxList) {
        this.foxList = foxList;
    }

    public Optional<Fox> findMyFox(String name) {
        return foxList.stream()
                .filter(fox -> fox.getName().equals(name))
                .findFirst();
    }

    public boolean contains(Fox fox){
        return foxList.contains(fox);
    }




}
