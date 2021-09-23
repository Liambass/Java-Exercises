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
