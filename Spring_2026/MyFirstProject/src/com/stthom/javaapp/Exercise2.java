package com.stthom.javaapp;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int x = scanner.nextInt();
		System.out.println("Enter second number: ");
		int y = scanner.nextInt();
		System.out.println(greater(x,y) + " is greater");

	}

	public static int greater(int n, int m) {
		if (n > m) {
		    return n;
		} else {
			return m;
		}
	}
}
