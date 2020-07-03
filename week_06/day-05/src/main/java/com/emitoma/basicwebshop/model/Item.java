package com.emitoma.basicwebshop.model;

public class Item {
    private String name;
    private String description;
    private int price;
    private Currency currency;
    private int quantityOfStock;

    public Item(String name, String description, int price, Currency currency, int quantityOfStock) {
        this.name = name;
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

}
