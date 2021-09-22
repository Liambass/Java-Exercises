package com.liambass.exceptionsexercise;

import java.util.Scanner;

public class Input {

	Scanner scan = new Scanner(System.in);
	
	public String getString() {
		return scan.nextLine();
	}
	
	public Integer getInt() {
		boolean flag = true;
		String str;
		Integer intIn = null; 
		
		while (flag) {
			try {
				str = getString();
				intIn = Integer.parseInt(str);
				flag = false;
			} catch (NumberFormatException e) {
				System.out.println("Error: Please enter an integer");	
			}
		}
		return intIn;
	}
	
	public Double getDouble() {
		boolean flag = true;
		String str;
		Double doubleIn = null; 
		
		while (flag) {
			try {
				str = getString();
				doubleIn = Double.parseDouble(str);
				flag = false;
			} catch (NumberFormatException e) {
				System.out.println("Error: Please enter a number");	
			}
		}
		return doubleIn;
	}
	
}
