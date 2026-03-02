package com.stthom.javaapp;

import java.util.Scanner;

public class WhileWithSentinel {

	public static void main(String[] args) {
		double itemPrice = 0;
		double totalPrice = 0;
		Scanner scanner = new Scanner(System.in);
		String flag = "y";
		while (flag.equals("y")) {  // flag == "y"
			System.out.println("Enter the item price : ");
			itemPrice = scanner.nextDouble();
			totalPrice += itemPrice;
			System.out.println("Do you have more items y/n");
			flag = scanner.next();
		}
        System.out.println("Total Price is "+totalPrice);
	}
}
