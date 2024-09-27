package com.beginner;

import java.util.Arrays;
import java.util.HashSet;

public class UniqueCharInString {

	public static void main(String[] args) {
		
		String str ="apple";
		
		HashSet<Character> set = new HashSet<Character>();
		
		for(int i=0;i<str.length();i++) {
			set.add(str.charAt(i));
		}
		
		if(set.size()==str.length())
			System.out.println("unique");
		else
			System.out.println("duplicates");
		
		uniqueCharacters(str);
		
		UniqueCharInString obj = new UniqueCharInString();
		obj.m1("abcd");
		obj.m1(10f);		
	}
	
	
	static int MAX_CHAR = 256; 
	static boolean uniqueCharacters(String str)
    {
        // If length is greater than 256,
        // some characters must have been repeated
        if (str.length() > MAX_CHAR)
            return false;
 
        boolean[] chars = new boolean[MAX_CHAR];
        Arrays.fill(chars, false);
 
        for (int i = 0; i < str.length(); i++) {
            int index = (int)str.charAt(i);
 
            /* If the value is already true, string
               has duplicate characters, return false */
            if (chars[index] == true)
                return false;
 
            chars[index] = true;
        }
 
        /* No duplicates encountered, return true */
        return true;
    }
	public void m1(String o) {
		System.out.println("string");
		
	}
	public void m1(Object o) {
		System.out.println("object");
	}
	
	public void m1(int o) {
		System.out.println("int");
		
	}
	public void m1(float o) {
		System.out.println("float");
	}
	
	
}
