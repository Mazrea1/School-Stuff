package com.stthom.javaapp;

import java.util.Scanner;

public class NestedLoopWhileFor {
    public static String MESSAGE = "THANK YOU"; // global variable
	public static void main(String[] args) {
		studentGrading();
		System.out.println("Thanks !!");
	}
	
	public static void studentGrading() {
		Scanner input = new Scanner(System.in);
		
		String flag = "y";
		double totalScore = 0;
		while (flag.equals("y")) {
				totalScore = getScoresAndTotal(); // get scores from user and return total
				displayAverageAndTotal(totalScore);  // actual parameter
				totalScore = 0;
				System.out.println("Do you have more students y/n: ");
				flag = input.next();
		}

	}
	
	public static double getScoresAndTotal() {
		Scanner input = new Scanner(System.in);
		double score,totalScore=0; // scope of a variable is local to the method
		System.out.println("Enter Score for MATH, CS and PS course for this student: ");
		for (int i = 0;i<3;i++) {
			score = input.nextDouble();
			totalScore += score;
		}
		System.out.println(MESSAGE);
		return totalScore;
	}
	
	public static void displayAverageAndTotal(double total) { // formal parameter
		double average = total/3;
		System.out.println("The Total is: "+total);
		System.out.println("The Average is:" +average);
	}

}
