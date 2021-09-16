//Expand the Results class so that there is now a pass mark of 60%; if the person receives under 60% they get a fail message.
//
//Expand the previous example so that even if the person gets higher than 60% overall, if they fail 1 or more of the exams (pass grade of 60% for each exam) they still fail overall.
//
//eg. if a student's scores were: Biology: 150, Chemistry: 150, Physics: 84
//
//they would have an overall grade of 85.3% (Pass)
//
//but in this case the student would fail because their physics grade is 54% (Fail)
//
//Expand the above so that the message that is displayed varies depending on the number of subjects that they have failed.

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
