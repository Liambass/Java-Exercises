package com.liambass.conditionalsexercises;

public class CalculatorRevisited {

	public static void main(double num1, double num2) {
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
