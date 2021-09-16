//Create a method that takes a number 10-99, and adds the two digits together for example 74 = 7 + 4 = 11.
//Create a second method that when given the number 1-99 returns a String representation of this number, for example 1 = one, 11 = eleven, 21 = twenty-one.
//Expand on the method you wrote in Numbers 2 to allow the input 1-999.
//Expand the method you wrote in Numbers 2 to allow the input 1-9999
//Use a for()-loop to print the numbers 1-100 in words. For example; 1 = one, 100 = one hundred.

package com.liambass.iterationexercises;

public class Numbers {

	public static void main(int num) {
		addDigits(num);
		numToWords(num);
		for (int i = 1; i <= 100; i++) {
			numToWords(i);
		}
	

	}

	private static void numToWords(int num) {
		String out = "";
		if (num > 999) {
			int i  = num / 1000;
			out += oneNine(i) + "Thousand ";
			num = num % 1000;
		}
		if (num > 99) {
			int i  = num / 100;
			out += oneNine(i) + "Hundred ";
			num = num % 100;
		}
		if (num != 0 && out != "") {out += "and ";}
		if (num > 19) {
			int i  = num / 10;
			out += tenNinety(i);
			num = num % 10;
		}
		if (num > 9) {out += tenNineteen(num);}
		else if (num != 0) {out += oneNine(num);}
		
		System.out.println(out);
		
	}

	private static String tenNineteen(int i) {
		switch(i) {
			case 10:
				return "Ten";
			case 11:
				return "Eleven";
			case 12:
				return "Twelve";
			case 13:
				return "Thirteen";
			case 14:
				return "Fourteen";
			case 15:
				return "Fifteen";
			case 16:
				return "Sixteen";
			case 17:
				return "Seventeen";
			case 18:
				return "Eighteen";	
			case 19:
				return "Nineteen";
			default:
				return "zero";
		}
	}

	private static String tenNinety(int i) {
		switch(i) {
			case 2:
				return "Twenty ";
			case 3:
				return "Thirty ";
			case 4:
				return "Fourty ";
			case 5:
				return "Fifty ";
			case 6:
				return "Sixty ";
			case 7:
			return "Seventy ";
			case 8:
				return "Eighty ";	
			case 9:
				return "Ninety ";
			default:
				return "zero ";
		}
	}

	private static String oneNine(int i) {
		switch(i) {
			case 1:
				return "One ";
			case 2:
				return "Two ";
			case 3:
				return "Three ";
			case 4:
				return "Four ";
			case 5:
				return "Five ";
			case 6:
				return "Six ";
			case 7:
				return "Seven ";
			case 8:
				return "Eight ";	
			case 9:
				return "Nine ";
			default:
				return "zero ";
		}
	}

	private static void addDigits(int num) {
		System.out.println((num/10) + (num % 10));
		
	}

}
