package com.stthom.javaapp;

public class RepetitiveStructure1 {

	public static void main(String[] args) {
		int counter = 0;  // Counter -- initialized
		while (counter < 10) {   // condition to check the counter
			System.out.println(counter + ", Raj Joseph");
			counter++; // incrementor eq.of counter = counter + 1
		}
		
		int counter2 = 10;
		while (counter2 >=1) {
			System.out.println(counter2 + ", Lisa");
			counter2--;
		}
		
		
		for (int i = 1; i<=10; i++) {
			System.out.println(i+ ", Sahil");
		}
		
	}
}
