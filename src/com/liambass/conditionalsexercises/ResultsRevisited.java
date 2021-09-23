package com.liambass.conditionalsexercises;


public class ResultsRevisited {

	public static void main(int phy, int chem, int bio) {
		
		total(phy, chem, bio);
		percent(phy, chem, bio);
		
	}

	private static void percent(int phy, int chem, int bio) {
		int tot = phy + chem + bio;
		float percent = (float)tot * 100 / 450;
		int failed = failed(phy, chem, bio);
		System.out.println(tot + "/450 equates to a percentage of " + percent + "%.");
		if(percent < 60) {
			System.out.println("Unfortunately, as your total score was less than 60% you have failed on this course.");
		} else if(failed != 0) {
			System.out.println("You failed " + failed + " exams, this unfortunately means that you fail overall.");
		} else {
			System.out.println("You passed!");
		}
	}

	private static int failed(int phy, int chem, int bio) {
		int i = 0;
		if(phy < 90) {
			i++;
			System.out.println("You failed Physics.");
		}
		if(chem < 90) {
			i++;
			System.out.println("You failed Chemistry.");
		}
		if(bio < 90) {
			i++;
			System.out.println("You failed Biology.");
		}
		return i;
	}

	private static void total(int phy, int chem, int bio) {
		int tot = phy + chem + bio;
		System.out.println("Your Physics mark was " + phy + "/150.");
		System.out.println("Your Chemistry mark was " + chem + "/150.");
		System.out.println("Your Biology mark was " + bio + "/150.");
		System.out.println("These results give you a total mark of " + tot + "/450.");
	}

}
