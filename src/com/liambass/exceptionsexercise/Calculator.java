package com.liambass.exceptionsexercise;

public class Calculator {

	static double div(double num1, double num2) throws DivException {
		if (num2 == 0 || num2 > num1) {
			throw new DivException();
		}
		return num1 / num2;
	}

	static double mult(double num1, double num2) {
		return num1 * num2;
	}

	static double sub(double num1, double num2) {
		return num1 - num2;
	}

	static double add(double num1, double num2) {
		return num1 + num2;

	}

}
