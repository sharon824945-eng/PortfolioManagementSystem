package com.InventorySystem;

public class InventoryItem {


    private Product product;
    private int quantity;

    public InventoryItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public void display() {
        product.display();
        System.out.println("Quantity: " + quantity);
        System.out.println(
            "Total Value: " + (product.getPrice() * quantity)
        );
    }
}

