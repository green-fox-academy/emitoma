package com.example.bankofsimba.model;

public class BankAccount {
    private String name;
    private int balance;
    private String animalType;
    private boolean isKing;
    private boolean isBadGuy;

    public BankAccount() {
    }

    public BankAccount(String name, int balance, String animalType) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
    }

    public BankAccount(String name, int balance, String animalType, boolean isKing, boolean isBadGuy) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.isKing = isKing;
        this.isBadGuy = isBadGuy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public boolean isKing() {
        return isKing;
    }

    public void setIsKing(boolean isKing) {
        this.isKing = isKing;
    }

    public boolean isBadGuy() {
        return isBadGuy;
    }

    public void setIsBadGuy(boolean badGuy) {
        this.isBadGuy = badGuy;
    }

    public String getKingStyleClass() {
        return this.isKing ? "king" : "";
    }

    public String getBadString() {
        return this.isBadGuy ? "Bad guy" : " Good one";
    }

    public void incrementBalance() {
        if (isKing) {
            balance += 100;
        } else {
            balance += 10;
        }
    }
}
