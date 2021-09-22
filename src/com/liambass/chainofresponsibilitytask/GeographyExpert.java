package com.liambass.chainofresponsibilitytask;

import java.util.HashMap;

public class GeographyExpert extends Team {
	
	HashMap<String, String> knowledge = new HashMap<>();

	public GeographyExpert() {
		knowledge.put("Capital of England?", "London");
		knowledge.put("Capital of Japan?", "Tokyo");
		knowledge.put("Capital of Germany?", "Berlin");
		knowledge.put("Capital of Belgium?", "Brussles");
		
	}

	@Override
	public boolean check(String question, String answer) {
		if (knowledge.get(question) == answer) {
			System.out.println("The geography expert knows the answer: " + answer);
			return true;
		}
		System.out.println("The geography expert does not know the answer.");
		return checkNext(question, answer);
	}
	
	
	

}
