//A person takes 3 exams in college, Physics, Chemistry, and Biology, each exam has a maximum of 150 marks. When all the exam marks have been added together, we can find the overall percentage that the person has got by multiplying their score by 100 and then dividing by 450.
//
//Create the results class, this class has 5 variables, Physics, Chemistry, and Biology, total and percentage. This class should also have 2 methods:
//
//Method 1 - displays the results that the person got for each exam and then the total mark. Try to make the output neat and bespoke for each exam.
//Method 2 - which finds and displays the percentage that the person received for the exams overall.

package com.liambass.operatorsexercises;

public class Results {

	public static void main(String[] args) {
		int phy = 132;
		int chem = 111;
		int bio = 89;
		int tot;
		float percent;

		tot = total(phy, chem, bio);
		percent = percent(tot);

	}

	private static float percent(float tot) {
		System.out.println((int) tot + "/450 equates to a percentage of " + (tot * 100 / 450) + "%.");
		return tot * 100 / 450;
	}

	private static int total(int phy, int chem, int bio) {
		System.out.println("Your Physics mark was " + phy + "/150.");
		System.out.println("Your Chemistry mark was " + chem + "/150.");
		System.out.println("Your Biology mark was " + bio + "/150.");
		System.out.println("These results give you a total mark of " + (phy + chem + bio) + "/450.");
		return phy + chem + bio;
	}

}
