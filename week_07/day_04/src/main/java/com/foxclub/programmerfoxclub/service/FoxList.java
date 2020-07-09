package com.foxclub.programmerfoxclub.service;

import com.foxclub.programmerfoxclub.model.Drink;
import com.foxclub.programmerfoxclub.model.Food;
import com.foxclub.programmerfoxclub.model.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class FoxList {
    List<Fox> foxList = new ArrayList<>(Arrays.asList(
            new Fox("Karak", "Code Java", Food.HAMBURGER, Drink.APPLEJUICE),
            new Fox("Vuk", "Steal chickens", Food.PIZZA, Drink.WATER)
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

    public String findMyFox(String name){
       return foxList.stream()
                .filter(fox -> fox.getName().equals(name))
               .toString();
    }
    public String getFox(String name){

    }

}
