package com.stthom.javaapp;

import java.util.Scanner;

public class Arithmetic4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b, c = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter values for a,b,c:");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();

		double result = (a*b + b*c)/(2*a*c) - a;
		System.out.println("The Result is : "+result);
	}

}
