package com.emitoma.basicwebshop.model;

import java.text.NumberFormat;
import java.util.Locale;

public class Item {
    private String name;
    private ItemType type;
    private String description;
    private double price;
    private Currency currency;
    private int quantityOfStock;

    private static Currency currentCurrency = Currency.HUF;


    public Item(String name, ItemType type, String description, double price, Currency currency, int quantityOfStock) {
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
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

    public static Currency getCurrentCurrency() {
        return currentCurrency;
    }

    public static void setCurrentCurrency(Currency currentCurrency) {
        Item.currentCurrency = currentCurrency;
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

    public String getFormattedPrice() {
        double targetPrice = this.price;
        if (currentCurrency == Currency.HUF && this.currency == Currency.EUR) {
            targetPrice *= 353;
        } else if (currentCurrency == Currency.EUR && this.currency == Currency.HUF) {
            targetPrice /= 353;
        }
        return formatCurrency(targetPrice, currentCurrency);
    }

    private String formatCurrency(double price, Currency targetCurrency) {
        NumberFormat format = NumberFormat.getInstance();
        format.setMaximumFractionDigits(2);
        format.setMinimumFractionDigits(2);
        java.util.Currency currency = java.util.Currency.getInstance(String.valueOf(targetCurrency));
        format.setCurrency(currency);

        return format.format(price) + currency.getSymbol(new Locale("hu", "HU"));
    }


}
