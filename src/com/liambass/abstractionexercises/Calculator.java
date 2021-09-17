package com.liambass.abstractionexercises;

public class Calculator implements MathsChallenge {



	@Override
	public int sumOfDivisors(int input) {
		int out = 0;
		for (int i = input; i > 0; i--) {
			if(input % i == 0) {
				out += i;
			}
		}
		return out;
	}

}
