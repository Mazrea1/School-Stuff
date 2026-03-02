package com.stthom.javaapp;

import java.util.Scanner;

public class Mathpower {

	public static void main(String[] args) {
		int x = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the x value to find to the power of 5: ");
		x = scanner.nextInt();
		double result = Math.pow(x, 5);
		System.out.println("REsult of x to the power 5 is "+result);
	}

}
