package com.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RemoveCommonCharacterFromString {

	public static void main(String[] args) {

		String s1 = "hello";
		String s2 = "bye";

		Set<Character> set1 = new HashSet<>();

		for (char s : s1.toCharArray())
			set1.add(s);

		Set<Character> set2 = new HashSet<>();

		for (char s : s2.toCharArray())
			set2.add(s);

		StringBuilder builder1 = new StringBuilder();
		StringBuilder builder2 = new StringBuilder();

		for (char s : s1.toCharArray()) {
			if (!set2.contains(s))
				builder1.append(s);
		}

		for (char s : s2.toCharArray()) {
			if (!set1.contains(s))
				builder2.append(s);
		}

		System.out.println(builder1.toString() + "::" + builder2.toString());
	}

	/*
	 * 
	 * Time Complexity: Building sets: O(n + m), where n is the length of str1 and m
	 * is the length of str2. Finding the intersection: O(min(n, m)). Constructing
	 * the result strings: O(n + m). Thus, the overall time complexity is O(n + m).
	 */

}
