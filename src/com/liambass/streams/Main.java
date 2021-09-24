package com.liambass.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Michael", "Dean", "James", "Chris");
		names.stream()
			.filter(x -> x != "James")
			.forEach(x -> System.out.println("Hello " + x));
		
		List<Integer> nums = Arrays.asList(3, 4, 7, 8, 12);
		System.out.println(nums.stream()
				.reduce((a,b) -> a * b).get());
		
		
		List<Integer> nums2 = Arrays.asList(34, 72, -3, 42, 121, 16, 26, 485);
		
		int max = nums2.stream()
				.max((a,b) -> Integer.compare(a, b)).get();
		int min = nums2.stream()
				.min((a,b) -> Integer.compare(a, b)).get();
		List<Integer> evens = nums2.stream()
				.filter(x -> x % 2 == 0)
				.collect(Collectors.toList());
		List<Integer> odds = nums2.stream()
				.filter(x -> x % 2 != 0)
				.collect(Collectors.toList());		
		int sum = nums2.stream().reduce((a,b) -> a + b).get();
		int minOddSquare = nums2.stream()
				.map(x -> x*x)
				.filter(x -> x % 2 != 0)
				.min((a,b) -> Integer.compare(a, b)).get();
				
		System.out.println("Maximum value in nums2 is: " + max);
		System.out.println("Minimum value in nums2 is: " + min);
		System.out.println("The even values in nums2 are: " + evens);
		System.out.println("The odd values in nums2 are: " + odds);
		System.out.println("The sum of values from nums2 is: " + sum);
		System.out.println("The minimum value of the odd "
				+ "squares of the values in nums2 is: " + minOddSquare);
		
	}
}
