package com.stthom.javaapp;

import java.util.Scanner;

public class LibraryFunctions2 {

	public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Please Enter a decimal value : ");
	   double xyz = scanner.nextDouble();
	   double area =  Math.PI * Math.pow(xyz, 2);
	   System.out.printf("The area of Circle is %3.2e", area);
	   System.out.println();
	   System.out.println((int)Math.random() *100);
	}

}
