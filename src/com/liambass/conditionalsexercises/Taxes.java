package com.liambass.conditionalsexercises;

public class Taxes {

	public static void main(float salary) {
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
