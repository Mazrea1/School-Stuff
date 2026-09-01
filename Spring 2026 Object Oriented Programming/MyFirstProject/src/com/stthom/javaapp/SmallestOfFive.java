package com.stthom.javaapp;

import java.util.Scanner;

public class SmallestOfFive {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double x = 999999;
		double currentValue;
		for (int i = 1; i<=5; i++) {
			System.out.println("Enter a number: ");
			currentValue = input.nextDouble();
			if (currentValue < x) {
				x = currentValue;
			}
		}
		System.out.println(x);
	}

}
