package com.stthom.javaapp;

import java.util.Scanner;

public class SumOfExressions {

	public static void main(String[] args) {
		// Declare a variable of int data type
		// get the value from the user
		int x = 0;
		int counter = 1;
		double total = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a integer value of x : ");
		x = scanner.nextInt();
		while(counter <= 10) {
			total = total + 2 * Math.pow(x, counter);
			counter= counter + 1; // counter++
		}
		System.out.println("THe result of the sum of expression: "+total);
	}
}
