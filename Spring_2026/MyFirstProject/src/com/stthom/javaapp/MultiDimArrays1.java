package com.stthom.javaapp;

import java.util.Scanner;

public class MultiDimArrays1 {

	public static void main(String[] args) {
		int[][] studentGrades = new int[5][3];
		Scanner input = new Scanner(System.in);
		for (int i = 0;i<5;i++) {
			for (int j = 0; j<3;j++) {
				System.out.println("Enter the grades for student "+(i+1));
				studentGrades[i][j] = input.nextInt();
			}
		}
		
		
		for (int i = 0;i<5;i++) {
			double total = 0;
			for (int j = 0; j<3;j++) {
				total += studentGrades[i][j];
			}
			System.out.println("Average of student in this semester: "+total/3);
		}

	}

}
