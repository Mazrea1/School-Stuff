package com.stthom.javaapp;

public class Exercise3 {

	public static void main(String[] args) {
		printMyName("Raj Joseph");
		printMyName("Victoria");
		for (int i = 0;i<10;i++) {
			System.out.println("Raj Joseph");
		}
		int y = 0;
		do {
			System.out.println("Raj Joseph");
			y++;
		}while (y<10);
	}
	
	public static void printMyName(String n) {
		int counter = 10;
		while (counter>0) {
			System.out.println(n);
			counter--;
		}
	}

}
