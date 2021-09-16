//Write a method that calculates the largest prime factor of a given number

package com.liambass.iterationexercises;

public class GreatestPrimeFactor {

	public static void main(int num) {
		System.out.println(grPriFact(num));  

	}

	private static int grPriFact(int num) {
		for(int i = num; i > 1; i--) {
			if(num % i == 0 && prime(i)) {return i;}
		}
		return 1;
	}

	private static boolean prime(int i) {
		for (int j = i - 1; j > 1; j--) {
			if (i % j == 0) {return false;}
		}
		return true;
	}

}
