package com.notepad;

import java.util.LinkedHashMap;
import java.util.Map;

public class SecondNonRepeatedCharInString {

	public static void main(String[] args) {

		/*
		 * String s= "aaaabbbbef" Find the second non repeated character (f)
		 */
		String s= "aaaabbbbnlk";
		char ch = findingSecondRepChar(s);
		
		if(ch != '\0')
			System.out.println("second char--"+ch);
		else
			System.out.println("no second char found");
		
	}

	private static char findingSecondRepChar(String s) {
		
		
		Map<Character,Integer> map = new LinkedHashMap<>();
		
		for(char c : s.toCharArray()) {
			map.put(c,map.getOrDefault(c, 0)+1);
		}
		int count = 0 ;
		for(Map.Entry<Character,Integer>  e : map.entrySet()) {
			
			if(e.getValue()==1) 
				count++;
			
			if(count == 2) {
				return e.getKey();
			}
		}
		
		return '\0' ;
	}
}
