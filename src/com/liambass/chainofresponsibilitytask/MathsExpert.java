package com.liambass.chainofresponsibilitytask;

import java.util.HashMap;

public class MathsExpert extends Team {

	HashMap<String, String> knowledge = new HashMap<>();

	public MathsExpert() {
		knowledge.put("12 + 4?", "16");
		knowledge.put("2^3?", "8");
		knowledge.put("42 + 42?", "84");
		knowledge.put("sqrt(-1)?", "i");

	}

	@Override
	public boolean check(String question, String answer) {
		if (knowledge.get(question) == answer) {
			System.out.println("The Maths expert knows the answer: " + answer);
			return true;
		}
		System.out.println("The maths expert does not know the answer.");
		return checkNext(question, answer);
	}

}