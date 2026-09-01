package com.stthom.javaapp;

import java.util.Random;
import java.util.Scanner;

public class MultiDimArray2 {

	public static void main(String[] args) {
		int[][] studentGrades = new int[5][3];
		Scanner input = new Scanner(System.in);
		Random randomNumberGenerator = new Random();
		for (int i = 0;i<5;i++) {
			for (int j = 0; j<3;j++) {
				
				//studentGrades[i][j] = input.nextInt();
				//studentGrades[i][j] = (int) (Math.random() * 100);
				studentGrades[i][j] = randomNumberGenerator.nextInt(50,101);
				System.out.println("Grade for student "+(i+1) + " - subject "+(j+1) + ": "+studentGrades[i][j]);
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
