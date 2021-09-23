package com.liambass.conditionalsexercises;

public class FizzBuzz {

	public static void main(int limit) {
		fizzBuzz(limit);

	}

	private static void fizzBuzz(int limit) {
		for(int i = 1; i <= limit; i++) {
			String out = "";
			if(i % 3 == 0) {
				out += "Fizz";
			}
			if(i % 5 == 0) {
				out += "Buzz";
			}
			if(out == "") {
				System.out.println(i);
			} else {
				System.out.println(out);
			}
		}
		
	}

}
