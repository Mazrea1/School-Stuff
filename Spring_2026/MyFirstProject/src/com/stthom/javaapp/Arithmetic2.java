package com.stthom.javaapp;

import java.util.Scanner;

public class Arithmetic2 {

	public static void main(String[] args) {
		
		double x = 0;
		double y = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter value of x: ");
		x = input.nextDouble();
		System.out.println("Enter value of y: ");
		y = input.nextDouble();
		System.out.println("The result of the formula is: "+ calculate(x,y));
		System.out.println(NestedLoopWhileFor.MESSAGE);
        
	}
	
	public static double calculate(double xf, double yf) { 
		return (2*xf + xf*yf + 15*(xf+yf))/(xf+yf+2*xf);
	}

}
