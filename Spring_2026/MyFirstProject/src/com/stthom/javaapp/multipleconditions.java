package com.stthom.javaapp;

import java.util.Scanner;

public class multipleconditions {

	public static void main(String[] args) {
		double score=0; // initialization
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the score for COSC 1436 Exam: ");
		score = scanner.nextDouble();
		if (score >=90) {
			System.out.println("A Grade ! - Excellent");
		} else if ( score >=80) {
			System.out.println("B Grade ! - Good Job");
		} else if ( score >= 70) {
			System.out.println("C Grade ! - You made it through");
		} else if ( score >= 60) {
			System.out.println("D Grade - Try better next time");
		} else {
			System.out.println("F Grade - Sorry");
		}

	}

}
