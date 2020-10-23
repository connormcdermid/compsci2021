package com.mcdermid;

public class Fruit {

    private String fruitName;
    private int quantity;

    public Fruit(String name, int quantity) {
        this.fruitName = name;
        this.quantity = quantity;
    }

    public String toString() {
        return quantity + " " + fruitName;
    }
}
