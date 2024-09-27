package com.begi.practice;

import java.util.Arrays;
import java.util.HashMap;

public class FirstNonRepeatedChar {

	public static void main(String[] args) {

		/*
		 * 9. Write a program to find first non-repeating character from a input string
		 * Ex: Input : { "array", "apple", "rat"} Output: y,a,r
		 */

		String[] arr = { "array", "apple", "ratrat" };
		char[] ch =  {'y','a','r'};
		System.out.println(Arrays.toString(ch));

		for (String s : arr) {

			char result = countOccurence(s);
			System.out.println(result);

		}
	}

	private static char countOccurence(String s) {

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		for (char c : s.toCharArray()) {
			hm.put(c, hm.getOrDefault(c, 0) + 1);
		}
		
		for (char c : s.toCharArray()) {
			if(hm.get(c)==1)
				return c;
		}
		return '-';
	}

}
