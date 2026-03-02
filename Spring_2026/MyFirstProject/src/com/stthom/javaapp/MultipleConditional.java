package com.stthom.javaapp;

import java.util.Scanner;

public class MultipleConditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the total amount: ");
       double total = input.nextDouble();
       double discount = 0;
       if (total>= 100) {
    	   discount = .10;
       }else if (total >= 50) {
    	   discount = .05;
       } else {
    	   discount = 0.02;
       }
       double amtToPay = total - (total * discount);
       System.out.println("The Amount you owe: "+ amtToPay);
	}

}
