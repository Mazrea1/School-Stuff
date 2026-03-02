package com.stthom.javaapp;

import java.util.Scanner;

public class LogicalCondition1 {
	public static void main(String[] args) {
		double totalPrice = 0;
		int countOfShirts = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the total Price : ");
		totalPrice = scanner.nextDouble();
		System.out.println("How many shirt did you buy :");
		countOfShirts = scanner.nextInt();
		if (totalPrice>=100 && countOfShirts >= 5) {
			double discount = 0.30;
			double grandPrice = totalPrice * discount;
			System.out.println("Your final price is : "+ (totalPrice - grandPrice));
		} else {
			System.out.println("Sorry you dont qualify for 30% discount");
		}
	}

}
