package com.portfolio.app.model;

import java.util.ArrayList;
import java.util.List;

public class user1 {

    private String userId;
    private String name;
    private String email;

    private List<holding1> holdings;

    public user1(String userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;

        holdings = new ArrayList<>();
    }

    public void addholding(holding1 holding) {
        holdings.add(holding);
    }

    public void display() {

        System.out.println("User ID: " + userId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);

        System.out.println("\nHoldings:");

        for (holding1 h : holdings) {
            h.display();
            System.out.println("-------------------");
        }
    }
}

