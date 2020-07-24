package com.example.restworkshop.model.enities;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String title;
    private List<Address> addresses = new ArrayList<>();
    private WelcomeMessage welcome_message;

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

    public WelcomeMessage getWelcome_message() {
        return welcome_message;
    }

    public void setWelcome_message(WelcomeMessage welcome_message) {
        this.welcome_message = welcome_message;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public WelcomeMessage welcome() {
        return new WelcomeMessage("Oh, hi there " + this.name + ", my dear " + this.title + "!");
    }

}
