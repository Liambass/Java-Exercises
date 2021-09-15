//Given 3 integer values, return their sum. If one value is the same as another value, they do not count towards the sum. In other words, only return the sum of unique numbers given.

package com.liambass.conditionalsexercises;

public class UniqueSum {

	public static void main(String[] args) {
		int num1 = 2;
		int num2 = 2;
		int num3 = 5;
		
		int usum = uniqueSum(num1, num2, num3);
		System.out.println(usum);
	}

	private static int uniqueSum(int num1, int num2, int num3) {
		int i = 0;
		int j = 0;
		int k = 0;
		if(num1 != num2 && num1 != num3) {i = num1;}
		if(num2 != num1 && num2 != num3) {j = num2;}
		if(num3 != num1 && num3 != num2) {k = num3;}
		return i + j + k;
	}

}
