package com.practice;

import java.util.HashSet;
import java.util.Set;

public class UniqueSubStringOfGivenLength {

	public static void main(String[] args) {

		/*
		 * "9. Find out unique substring of given length of string. EX: Input - (aab,2)
		 * , Output - aa, ab Input- (aabc,2), Output - aa, ab,bc Input -(abc,1), Output
		 * - a,b,c"
		 * 
		 */
		String str  = "aab";
		int givenLength = 2;
		Set<String> output = fetchSubStr(str,givenLength);
		System.out.println(output);
	}

	private static Set<String> fetchSubStr(String str, int givenLength) {
		
		Set<String> list = new HashSet<String>();
		
		if(givenLength==0) {
			list.add(str);
			return list;
		}
		if(givenLength==1) {
			for(String s : str.split("")) {
				list.add(s);
			}
			return list;
		}
		
		int length = str.length();
		
		for(int i=0;i<=length-givenLength;i++) {
			list.add(str.substring(i, givenLength+i));
		}
		
		return list;
	}
	
	

}
