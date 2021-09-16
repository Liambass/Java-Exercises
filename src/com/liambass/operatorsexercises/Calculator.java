//Create a method that accepts two integers as input, then returns an integer that is the sum of these two parameters. (Addition)
//
//Create the following additional three methods that each take two parameters:
//
//Multiplication - which takes two numbers and returns the product.
//Subtraction - which takes two numbers, then returns the result of the subtraction.
//Division - which takes two numbers, then returns the result of the division.
//Your division method may have returned the wrong result; This is called a rounding error and is quite common in most languages. this is because we were using ints rather than doubles. Modify the division method so that it takes Double parameters and then return a Double, if not already.

package com.liambass.operatorsexercises;

public class Calculator {

	public static void main(String[] args) {
		int num1 = 4;
		int num2 = 12;
		System.out.println(add(num1, num2));
		System.out.println(sub(num1, num2));
		System.out.println(mult(num1, num2));
		System.out.println(div(num1, num2));

	}

	private static double div(double num1, double num2) {
		return num1 / num2;
	}

	private static int mult(int num1, int num2) {
		return num1 * num2;
	}

	private static int sub(int num1, int num2) {
		return num1 - num2;
	}

	private static int add(int num1, int num2) {
		return num1 + num2;
	}

}
