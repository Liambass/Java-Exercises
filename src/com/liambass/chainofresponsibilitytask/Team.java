package com.liambass.chainofresponsibilitytask;

public abstract class Team {
	
	private Team next;
	
	public Team linkWith(Team next) {
		this.next = next;
		return next;
	}

	public abstract boolean check(String question, String answer);
	
	protected boolean checkNext(String question, String answer) {
		if (next == null) {
			return false;
		}
		return next.check(question, answer);
	}
	
}
