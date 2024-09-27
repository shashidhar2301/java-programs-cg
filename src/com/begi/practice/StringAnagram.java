package com.begi.practice;

import java.util.Arrays;

public class StringAnagram {

	
	public static void main(String[] args) {
		
		
		/*
		 * "1. Check the String is Anargam or not Ex: Dog, god Cat, tac, act angle -
		 * glean tar-rat car-rac"
		 */
		
		String s1= "Dogm";
		String s2 ="god";
		char[] ch1 = s1.toLowerCase().toCharArray();
		char[] ch2 = s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1, ch2))
			System.out.println("anagram");
		else
			System.out.println("not");
		
		boolean flag = isAnagram(s1,s2);
		System.out.println(flag);
	}
	
	static boolean isAnagram(String s1, String s2) {
		
		if(s1.length()!=s2.length())
			return false;
		
		int[] ch = new int[256];
		
		for(int i=0;i<s1.length();i++) {
			ch[s1.charAt(i)]++;
			ch[s2.charAt(i)]--;
		}
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!=0) {
				
				return false;
				
			}
		}
		
		return true;
	}
	
	
}
