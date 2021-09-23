package com.liambass.arraylistexercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise {

	public static void main(String[] args) {
		ArrayList<String> strAL = new ArrayList<>();
		strAL.add("This");
		strAL.add("is");
		strAL.add("not");
		strAL.add("an");
		strAL.add("Array List");
		List<Integer> intAL = new ArrayList<>(List.of(12, 42, 86, 512, 875, 9991, 3, 86, 444, 12547));
		System.out.println(strAL);
		System.out.println(intAL);

		printAL(strAL);

		System.out.println(strAL.get(4));
		strAL.set(4, "ArrayList");
		strAL.remove(2);
		System.out.println(strAL);

		Collections.sort(strAL);
		Collections.sort(intAL);
		System.out.println("strAL = " + strAL + " intAL = " + intAL);
		Collections.reverse(strAL);
		Collections.reverse(intAL);
		System.out.println("strAL = " + strAL + " intAL = " + intAL);
		
		Collections.swap(intAL, 0, 9);
		System.out.println(intAL);
		
		List cloneAL = (List) strAL.clone(); //can use this method to clone ArrayLists not Lists.
		System.out.println(cloneAL);

	}

	private static void printAL(List<String> strAL) {
		for (int i = 0; i < strAL.size(); i++) {
			System.out.println(strAL.get(i));
		}
		for (String i : strAL) {
			System.out.println(i);
		}
	}

}
