package MyFirstProject.src.com.stthom.javaapp;
import java.util.Scanner;

public class Conditional1 {

	public static void main(String[] args) {
		int x;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		x = scanner.nextInt();
		String answer = checkNumber(x);
		System.out.println("The number is " + answer);

	}
	public static String checkNumber(int x) {
		if (x > 0) {
			return "Positive";
		} else if (x < 0){
			return "Negative";
		} else {
			return "Zero";
		}
	}

}
