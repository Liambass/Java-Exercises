//Edit the division method in the Calculator class, the sum should only execute if the first parameter is smaller than the second, otherwise it prints out a message saying that the division cannot be performed.

package com.liambass.conditionalsexercises;

public class CalculatorRevisited {

	public static void main(String[] args) {
		double num1 = 4;
		double num2 = 12;
		System.out.println(add(num1, num2));
		System.out.println(sub(num1, num2));
		System.out.println(mult(num1, num2));
		div(num1, num2);

	}

	private static void div(double num1, double num2) {
		if(num1 < num2) {
			System.out.println(num1 / num2);
		} else {
			System.out.println("The division can not be performed");
		}
	}
	
	private static double mult(double num1, double num2) {
		return num1 * num2;
	}

	private static double sub(double num1, double num2) {
		return num1 - num2;
	}

	private static double add(double num1, double num2) {
		return num1 + num2;
	}

}
