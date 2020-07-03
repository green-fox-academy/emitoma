package com.emitoma.basicwebshop.model;

public class Item {
    private String name;
    private String description;
    private int price;
    private int quantityOfStock;

    public Item(String name, String description, int price, int quantityOfStock) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantityOfStock = quantityOfStock;
    }
}
