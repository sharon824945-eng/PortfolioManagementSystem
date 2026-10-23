
package com.InventorySystem;

public class Product {

    private String id;
    private String name;
    private double price;

    // Constructor
    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Getter for ID
    public String getId() {
        return id;
    }

    // Getter for Name
    public String getName() {
        return name;
    }

    // Getter for Price
    public double getPrice() {
        return price;
    }

    // Display product details
    public void display() {
        System.out.println("Product ID: " + getId());
        System.out.println("Product Name: " + getName());
        System.out.println("Product Price: " + getPrice());
    }

    // Main method to test the code
    public static void main(String[] args) {

        Product p1 = new Product("P101", "Laptop", 45000.0);

        p1.display();
    }
}
