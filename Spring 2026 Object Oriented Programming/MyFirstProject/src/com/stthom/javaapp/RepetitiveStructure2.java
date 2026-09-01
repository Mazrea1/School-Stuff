package com.stthom.javaapp;

public class RepetitiveStructure2 {

	public static void main(String[] args) {
		
		
		double total = 0;
		for (int i=0;i<10;i++) {
			total = total + i;
		}
		System.out.println("Result : "+total);
		
		for (int y =10; y>0;y--) {
			System.out.println(y);
		}
		
		for (int z = 0; z<=10; z+=2) {
			System.out.println(z);
		}
		
		double tuitionFees = 12000;
		for(int i = 0; i < 4; i++) {
			tuitionFees += tuitionFees +  0.02 * tuitionFees;
		}
		System.out.println("The Total Tuition Fees of 4 year college "+tuitionFees);

	}

}
