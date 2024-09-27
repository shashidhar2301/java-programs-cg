package com.practice;

import java.util.Set;

public class UnqSubStrByGivenLength {

	public static void main(String[] args) {

		/*
		 * "9. Find out unique substring of given length of string. EX: Input - (aab,2)
		 * , Output - aa, ab Input- (aabc,2), Output - aa, ab,bc Input -(abc,1), Output
		 * - a,b,c"
		 * 
		 */
		getSubStr("aab",2);
	}
	
	public static Set<String> getSubStr(String str, int length){
		
		//aab,2 ----- aa, ab
		int originalLength = str.length();
		
		for(int i=0;i<=originalLength-length;i++) {
			String st = str.substring(i, length+i);
			System.out.println(st);
		}
		
		
		return null;
		
	}
}
