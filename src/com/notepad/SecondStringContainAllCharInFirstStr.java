package com.notepad;

import java.util.HashSet;
import java.util.Set;

public class SecondStringContainAllCharInFirstStr {

	public static void main(String[] args) {

		/*
		 * Write the Java code to, the method should accept two strings and return
		 * Boolean, second string should contain only the chars present in 1st string
		 * Ex: str1="GET", valid strings are "TTTTTTT", "TEGGG", invalid strings:
		 * "ABCG",
		 * 
		 */
		String str1 = "GET";
		String str2 = "ABCG";
		boolean flag = booleanCheck(str1, str2);
		System.out.println(flag);
	}

	private static boolean booleanCheck(String str1, String str2) {
		
		boolean flag = false;
		
		Set<Character> set = new HashSet<>();
		
		for(char c : str1.toCharArray()) {
			set.add(c);
		}
		
		

		for(char c : str2.toCharArray()) {
			if(!set.contains(c))
				return false;
		}
		
		
		return true;
	}

}
