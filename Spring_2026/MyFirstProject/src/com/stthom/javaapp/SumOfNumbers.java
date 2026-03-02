package com.stthom.javaapp;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		// Declare a variable of int data type
		// get the value from the user
		int x = 0;
		int counter = 1;
		int total = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a integer value to sum from 1 to x: ");
		x = scanner.nextInt();
		while(counter <= x) {
			// computation or calculation
			total = total + counter;
			// increment of the counter
			counter = counter + 1; // counter++;
		}
		System.out.println("The sum of 1 + 2 + ... +x is "+total);
	}

}
