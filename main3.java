package com.portfolio.app.model;

public class main3 {

    public static void main(String[] args) {

        user1 user = new user1(
                "U101",
                "Ravi",
                "ravi@gmail.com"
        );

        holding1 h1 = new holding1(
                "TCS",
                10,
                3500
        );

        holding1 h2 = new holding1(
                "Infosys",
                5,
                1500
        );

        user.addholding(h1);
        user.addholding(h2);

        System.out.println("===== USER DETAILS =====");

        user.display();
    }
}
	