package com.emitoma.basicwebshop.model;

import java.lang.reflect.Type;

public class Item {
    private String name;
    private ItemType type;
    private String description;
    private int price;
    private Currency currency;
    private int quantityOfStock;


    public Item(String name, ItemType type, String description, int price, Currency currency, int quantityOfStock) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.price = price;
        this.currency = currency;
        this.quantityOfStock = quantityOfStock;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public int getQuantityOfStock() {
        return quantityOfStock;
    }

    public void setQuantityOfStock(int quantityOfStock) {
        this.quantityOfStock = quantityOfStock;
    }

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    public String getTypeString() {
        if (this.type == ItemType.CLOTHES) {
            return "Clothes and shoes";
        } else if (this.type == ItemType.ELECTRONICS) {
            return "Electronics";
        } else if (this.type == ItemType.FOOD) {
            return "Beverages and Snacks";
        }
        return "Unknown";
    }
}
