package com.stthom.javaapp;

import java.util.Scanner;

public class Methods1 {
	public static void main(String[] args) {
		double a, b,c = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter values for a,b,c: ");
		a= input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		
		System.out.println("Area of Circle for value a is "+areaOfCircle(a));
		printALine();
		System.out.println("Area of Circle for value b is "+areaOfCircle(b));
		printALine();
		System.out.println("Area of Circle for value c is "+areaOfCircle(c));
		printWhatIsGiven("Thank You !!");
		
		
		double result = (areaOfCircle(a+b) + c)/(b - areaOfCircle(a+c));
		System.out.println("RESULT : "+result);

	}
	
	public static double areaOfCircle(double rad) {
		double area = 3.1415 * rad * rad;
		return area;
	}
	
	public static void printALine() { // no arguments , no returns
		System.out.println("---------------------------------------------");
	}
	
	public static void printWhatIsGiven(String something) {
		System.out.println(something);
	}
	
	public static String greetings(String answer) {
		String msg = "";
		double result = 15.5;
		if (answer.equals("Great")) {
			msg = "Awesome !";
		} else if (answer.contains("well")) {
			msg = " You can do better than that !!";
		} else {
			msg = "OK !!";
		}
		return msg;
	}

}
