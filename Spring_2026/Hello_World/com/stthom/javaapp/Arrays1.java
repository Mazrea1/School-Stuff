package com.stthom.javaapp;

import java.util.Scanner;

public class Arrays1 {

	public static void main(String[] args) {
		int[] studentsGrades = {75,87,89,100,95,90,78,87};
		System.out.println(studentsGrades[3]);
		
		for (int i=0;i<studentsGrades.length;i++) {
			System.out.println(studentsGrades[i]);
		}
		Scanner input = new Scanner(System.in);
		double[] salaries = new double[5];
		for (int i = 0; i<5; i++) {
			System.out.println("Enter the salary for Employee "+(i+1) );
			salaries[i] = input.nextDouble();
		}
		
		System.out.println("The Entered salaries along with Bonus of 10% :");
		for (int i = 0;i<salaries.length;i++) {
			System.out.println(salaries[i]+(salaries[i]*0.1));
		}
		double[][] gradesForSemester = new double[5][3];
		for (int i = 0;i<5;i++) {
			for (int j = 0;j<3;j++) {
				gradesForSemester[i][j] = input.nextDouble();
			}
		}
	}

}
