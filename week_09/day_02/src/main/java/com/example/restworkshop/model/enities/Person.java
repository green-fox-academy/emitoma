package com.example.restworkshop.model.enities;

import com.example.restworkshop.model.enities.Address;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String title;
    private List<Address> addresses = new ArrayList<>();

    public Person(String name, String title) {
        this.name = name;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String welcome() {
        return "Oh, hi there " + this.name + ", my dear " + this.title + "!";
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
}
