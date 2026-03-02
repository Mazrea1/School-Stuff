package com.stthom.javaapp;

import java.util.Scanner;

public class Conditional2 {
	public static void main(String[] args) {
		
		// Find the value that the user entered is positive or negative
		int x = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		x = scanner.nextInt();
		if (x < 0) {
			System.out.println("Negative");
		} else {
			System.out.println("Positive");
		}
	}

}
