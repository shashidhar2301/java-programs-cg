package com.begi.practice;

import java.util.HashSet;
import java.util.Set;

public class ProgramStandsWithS {
	
	public static void main(String[] args) {
		
		/*
		 Write a program to print .
		 A. all String which starts as "S" from the given String array
		 B. Find out if String has all Unique Characters
		 Ex:
		 Input: {"apple","sample", "search","cat"}
		 output: { "sample", "search"}
		 */
		
		String[] arr =  {"apple","sample", "search","cat"};
		
		for(String s : arr) {
			
			if(s.startsWith("s"))
				System.out.println(s);
		}
		
		String s = "apple";
		Set<Character> set = new HashSet<Character>();
		boolean flag = true;
		
		for(char c : s.toCharArray()) {
			
			if(set.contains(c))
				flag = false;
			
			set.add(c);
				
		}
		
		if(flag)
			System.out.println("unique");
		else
			System.out.println("not");
		
	}

}
