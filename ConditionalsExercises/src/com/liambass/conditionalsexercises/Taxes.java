//Create the tax class, it contains 2 methods.
//
//Method 1 - which takes a salary and works out the percentage by which the salary will be taxed.
//
//Method 2 - which works out the exact amount that the user will be taxed using a similar process to that in the first method. That amount should be returned and output to the console.
//
//These 2 methods should be able to work independently, so it is fine in this case if some of the code is repeated.*
//
//The salaries are taxed as below:
//
//0 - 14,999 : 0% tax
//15,000 - 19,999 : 10% tax
//20,000 - 29,999 : 15% tax
//30,000 - 44,999 : 20% tax
//45,000+ : 25% tax
//Finally combine the 2 methods so that the second method utilizes the first method to return the correct result.

package com.liambass.conditionalsexercises;

public class Taxes {

	public static void main(String[] args) {
		float salary = 25000;
		System.out.println("Your highest tax bracket is " + maxTaxBracket(salary) + "%");
		float tax = tax(salary);
		System.out.println("Your total tax liability is £" + (int) tax);
		System.out.println("This is an effective tax rate of " + (tax / salary) * 100 + "%");

	}

	private static float tax(float salary) {
		float total = 0;
		if (salary >= 45000) {
			float i = salary - 45000;
			salary -= i;
			total += i * 0.25;
		}
		if (salary >= 30000) {
			float i = salary - 30000;
			salary -= i;
			total += i * 0.2;
		}
		if (salary >= 20000) {
			float i = salary - 20000;
			salary -= i;
			total += i * 0.15;
		}
		if (salary >= 15000) {
			float i = salary - 15000;
			salary -= i;
			total += i * 0.1;
		}
		return total;

	}

	private static int maxTaxBracket(float salary) {
		if (salary < 15000) {
			return 0;
		} else if (salary < 20000) {
			return 10;
		} else if (salary < 30000) {
			return 15;
		} else if (salary < 45000) {
			return 20;
		} else {
			return 25;
		}
	}

}
