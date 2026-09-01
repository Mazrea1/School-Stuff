package com.stthom.javaapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileInput1 {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\rajtj\\Downloads\\balance.txt");
		Scanner input = null;
		try {
			
			input = new Scanner(file);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		int myText = input.nextInt();
		System.out.println(myText);
		
		input.close();
		
		
	}

}
