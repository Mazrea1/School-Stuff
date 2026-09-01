package com.stthom.javaapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileOutput1 {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\rajtj\\Downloads\\balance.txt");
		// For Mac - "/Users/<<username>>/Downloads/test.txt"
		
		PrintWriter output = null;
		try {
			
			output = new PrintWriter(file);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		output.println("This is my Text");
		
		
		output.close();

	}

}
