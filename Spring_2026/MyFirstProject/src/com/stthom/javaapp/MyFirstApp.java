package com.stthom.javaapp;

import java.util.Scanner;

public class MyFirstApp {

	public static void main(String[] args) {
       // General run down of coding
	   // 1. Define all the variables you need for the program
	   // 2. Do the inputs or assignments
	   // 3. Process or business logic - problem solution
	   // 4. Do the Output
		
		// Radius of the circle
		double radius;
		double area;
		//radius = 5.15;
		Scanner inputTool = new Scanner(System.in);
		System.out.println("Raj, Enter the Radius :");
		radius = inputTool.nextDouble();
		area = 3.1415 * radius * radius;
		System.out.print("Radius is :\t");
		System.out.println(radius);
		System.out.println("The Area of Circle is "+ area);
		
	}

}
