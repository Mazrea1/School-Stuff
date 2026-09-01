package com.stthom.javaapp;

import java.util.Scanner;

public class LibraryFunctionsString {

	public static void main(String[] args) {
		String x = "Welcome To Java";
		System.out.println(x.toLowerCase());
		System.out.println(x.toUpperCase());
		String y = x.concat(" and C++");
		System.out.println(y);
		Scanner input = new Scanner(System.in);
		System.out.println("What did you have for lunch? ");
		String myText = input.nextLine();
		if (myText.toUpperCase().contains("BURGER")) {
			System.out.println("Waw I like burgers !!!");
		}

	}

}
