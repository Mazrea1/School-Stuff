package com.stthom.javaapp;

import java.util.Date;
import java.util.Scanner;

public class LibraryFunctions {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double power1 = Math.pow(2,5);
		System.out.println(Math.min(50,25));
		System.out.println(power1);
		System.out.println(Math.PI);
		Date date = new Date();
		System.out.println(date.toString());
		String firstName = "Raj";
		String lastName = "Joseph";
		System.out.println(firstName.concat(lastName));
		

	}

}
