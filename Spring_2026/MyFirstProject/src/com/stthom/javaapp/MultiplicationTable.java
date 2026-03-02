package com.stthom.javaapp;

public class MultiplicationTable {

	public static void main(String[] args) {
		for (int i = 1;i<=12;i++) {
			System.out.println("----------"+i + " TABLE "+ "------------------");
			for (int j = 1; j <= 12; j ++) {
				System.out.println(i + " X " + j + " = " + i*j);
			}
			
		}
	}
}
