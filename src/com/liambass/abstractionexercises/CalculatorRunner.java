//- Write a class called Calculator, which implements the following interface:
//
//    interface MathsChallenge{
//        int sumOfDivisors(int input);
//    }
//
//- Your implementation should take an integer (input) and return the sum of all of its divisors. E.g. 9 -> 1, 3, 9 -> 13.
//- The value of input will always be a positive whole number between 1 and 1000.
//- Friendly input, no edge cases :)

package com.liambass.abstractionexercises;

public class CalculatorRunner {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		int num = 42;
		
		System.out.println("The sum of " + num + "'s divisors is " + calc.sumOfDivisors(num));
	

	}

}
