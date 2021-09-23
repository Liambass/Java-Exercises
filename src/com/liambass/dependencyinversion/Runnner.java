package com.liambass.dependencyinversion;

public class Runnner {

	public static void main(String[] args) {
		Developer fed = new FrontendDeveloper();
		Developer bed = new BackendDeveloper();
		
		Project p = new Project();
		
		p.develop(bed);
		p.develop(fed);

	}

}
