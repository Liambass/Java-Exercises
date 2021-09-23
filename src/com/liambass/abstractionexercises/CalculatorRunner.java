package com.liambass.abstractionexercises;

public class CalculatorRunner {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		int num = 42;
		
		System.out.println("The sum of " + num + "'s divisors is " + calc.sumOfDivisors(num));
	

	}

}
