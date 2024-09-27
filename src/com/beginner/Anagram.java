package com.beginner;

import java.util.Arrays;

public class Anagram {
	
	public static void main(String[] args) {
		
		String s1 ="rat";
		String s2 ="cat";
		char[] charArray1 = s1.toCharArray();
		char[] charArray2 = s2.toCharArray();
		
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		//System.out.println(Arrays.equals(charArray1,charArray2));
		
		boolean flag = isAnagramCounting(s1,s2);
		System.out.println(flag);
	}

	
	private static int CHARACTER_RANGE= 256;

	public static boolean isAnagramCounting(String string1, String string2) {
	    if (string1.length() != string2.length()) {
	        return false;
	    }
	    int count[] = new int[CHARACTER_RANGE];
	    for (int i = 0; i < string1.length(); i++) {
	        count[string1.charAt(i)]++;
	        count[string2.charAt(i)]--;
	    }
	    for (int i = 0; i < CHARACTER_RANGE; i++) {
	        if (count[i] != 0) {
	            return false;
	        }
	    }
	    return true;
	}
}
