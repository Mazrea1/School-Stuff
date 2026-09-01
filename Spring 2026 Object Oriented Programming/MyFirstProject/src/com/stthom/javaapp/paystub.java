package com.stthom.javaapp;

public class paystub {

	public static void main(String[] args) {
		// Get the hrs worked, rate from the user
		// call totalEarnings(parameters - hrs, rate) will return the total earnings
		// call totalDeductions(parameters - total earnings) will return the total deductions
		// calculate net pay = total earnings - total deductions
		// display all the things in the pay stub
		
	}
	
	public static double totalEarnings(double hrs, double rate) {
		total earnings = grosspay(hrs, rate) + overTimePay(hrs, rate)
		return total earning;
	}
	
	public static double grossPay(double hrs, double rate) {
		
		if the hrs > 40 then gross pay = 40 * rate
		else grass pay = hrs * rate
		return gross pay
	}
	
	public static double overTimePay(double hrs, double rate) {
		if the hrs > 40 then overtime pay = hrs-40 * (rate * 1.5)
				else overtime pay = 0
				return overtime pay
	}
	
	public static double totalDeduction(double total) {
		
		return incomeTax(total) + healthDeduction();
	}

	public static double incomeTax(double total) {
		return total * 0.15;
	}
	
	public static double healthDeduction() {
		return 100.0;
	}
}
