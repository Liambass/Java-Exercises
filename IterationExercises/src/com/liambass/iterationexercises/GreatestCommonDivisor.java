//The Greatest Common Divisor of two positive integers is the largest integer that divides both without remainder. Write a method that returns the Greatest Common Divisor of p and q.

package com.liambass.iterationexercises;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		int num1 = 7;
		int num2 = 17;
		System.out.println(greatComDiv(num1, num2));

	}

	private static int greatComDiv(int num1, int num2) {
		for (int i = Math.min(num1, num2); i > 1; i--) {
			if (num1 % i == 0 && num2 % i == 0) {
				return i;
			}
		}
		return 1;
	}

}
