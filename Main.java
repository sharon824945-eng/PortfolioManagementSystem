package com.InventorySystem;

public class Main {

    public static void main(String[] args) {

        Product p = new Product("P101", "Laptop", 50000);
        Supplier s = new Supplier("S101", "ABC Suppliers");
        InventoryItem item = new InventoryItem(p, 5);
        Transaction t = new Transaction("T101", "STOCK_IN", 5);

        System.out.println("=== PRODUCT DETAILS ===");
        p.display();

        System.out.println("\n=== SUPPLIER DETAILS ===");
        s.display();

        System.out.println("\n=== INVENTORY DETAILS ===");
        item.display();

        System.out.println("\n=== TRANSACTION DETAILS ===");
        t.display();
    }
}

