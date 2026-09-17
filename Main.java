package com.portfolio.app.model;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
    	System.out.println("=====================================");
        System.out.println("Stock Portfolio Management Project");
        System.out.println("=====================================");
        
        
        System.out.println("Enter Userid");
        String userid=sc.nextLine();
        
        System.out.println("Enter user Name");
        String name=sc.nextLine();
        
        System.out.println("Enter email");
        String email=sc.nextLine();
        
        User user=new User(userid,name,email);
        user.display();
        
       
        
    }


}


