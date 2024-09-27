package com.test;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfCharInGivenFormat {

	public static void main(String[] args) {

		/*
		 * 20. Write a program which would take a string as input like 'aabccd' and
		 * print the occurances of characters in the format a=2,b=1,c=2,d=1
		 * 
		 */

		String str = "aabccda";
		StringBuilder result = new StringBuilder();
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.toCharArray().length; i++) {
			char ch = str.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		for (Map.Entry<Character, Integer> e : map.entrySet()) {
			result.append(e.getKey() + "=" + e.getValue() + ",");
		}
		// System.out.println(result.substring(0,result.length()-1));
		if (result.length() > 0)
			result.setLength(result.length() - 1);

		System.out.println(result);
	}

	/*
	 * ### Explanation:
	 * 
	 * 1. Input Handling: The program first reads the input string. 2.
	 * Counting Characters: A `HashMap` is used to store each character and its
	 * corresponding count. The `getOrDefault` method ensures that if the character
	 * isn't already in the map, it starts with a count of 0. 3. Building the
	 * Result: The program iterates through the map entries, appending each
	 * character and its count to a `StringBuilder` in the desired format. 4.
	 * Removing the Trailing Comma: The last comma is removed before printing
	 * the final result.
	 * 
	 * ### Time Complexity:
	 * 
	 * - Counting the characters: O(n), where `n` is the length of the input
	 * string. - Building the result string: O(m), where `m` is the number of
	 * unique characters.
	 * 
	 * Thus, the overall time complexity is O(n), since counting the characters is
	 * the dominant operation.
	 */

}
