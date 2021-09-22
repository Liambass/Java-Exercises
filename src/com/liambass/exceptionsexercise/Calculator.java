//Create a method that accepts two integers as input, then returns an integer that is the sum of these two parameters. (Addition)
//
//Create the following additional three methods that each take two parameters:
//
//Multiplication - which takes two numbers and returns the product.
//Subtraction - which takes two numbers, then returns the result of the subtraction.
//Division - which takes two numbers, then returns the result of the division.
//Your division method may have returned the wrong result; This is called a rounding error and is quite common in most languages. this is because we were using ints rather than doubles. Modify the division method so that it takes Double parameters and then return a Double, if not already.

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
