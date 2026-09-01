package com.stthom.javaapp;

import java.util.Scanner;

public class Arithmetic3 {

	public static void main(String[] args) {
		double a, b, c, d, e = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter values for a,b,c,d,e:");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		d = input.nextDouble();
		e = input.nextDouble();
		double result = ((240 * c * e - 50 * b * a)/(d + 20 * a * b)) - 2 * c;
		System.out.println("The Result is : "+result);
		

	}

}
