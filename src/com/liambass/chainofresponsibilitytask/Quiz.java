package com.liambass.chainofresponsibilitytask;

public class Quiz {

	public static void main(String[] args) {
		Team team = new GeographyExpert();
		team.linkWith(new MathsExpert()).linkWith(new HistoryExpert());

		String q1 = "Capital of England?";
		String a1 = "London";
		String q2 = "12 + 4?";
		String a2 = "16";
		String q3 = "How long has Lizzie 2 ruled?";
		String a3 = "69 years";
		String q4 = "Who painted \"The Scream\"?";
		String a4 = "Munch";

//		System.out.println(q1);
//		System.out.println((team.check(q1, a1))? "Your team gets a point!" : "Nobody on your team knew the answer.");

		
//		System.out.println(q2);
//		System.out.println((team.check(q2, a2))? "Your team gets a point!" : "Nobody on your team knew the answer.");

		
//		System.out.println(q3);
//		System.out.println((team.check(q3, a3))? "Your team gets a point!" : "Nobody on your team knew the answer.");

	
		System.out.println(q4);
		System.out.println((team.check(q4, a4))? "Your team gets a point!" : "Nobody on your team knew the answer.");

	}
}
