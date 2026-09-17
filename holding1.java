package com.portfolio.app.model;

public class holding1 {

    private String stock;
    private int quantity;
    private double purchasePrice;

    public holding1(String stock, int quantity, double purchasePrice) {
        this.stock = stock;
        this.quantity = quantity;
        this.purchasePrice = purchasePrice;
    }

    public void display() {
        System.out.println("Stock: " + stock);
        System.out.println("Quantity: " + quantity);
        System.out.println("Purchase Price: " + purchasePrice);
    }
}


