package com.liambass.chainofresponsibilitytask;

import java.util.HashMap;

public class HistoryExpert extends Team {

	HashMap<String, String> knowledge = new HashMap<>();

	public HistoryExpert() {
		knowledge.put("What year did WW2 end?", "1945");
		knowledge.put("How long has Lizzie 2 ruled?", "69 years");
		knowledge.put("How were the pyramids built?", "Aliens");
		knowledge.put("What year was the great fire of London?", "1666");

	}

	@Override
	public boolean check(String question, String answer) {
		if (knowledge.get(question) == answer) {
			System.out.println("The history expert knows the answer: " + answer);
			return true;
		}
		System.out.println("The history expert does not know the answer.");
		return checkNext(question, answer);
	}


}