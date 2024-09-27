package com.beginner;

import java.util.HashSet;
import java.util.Set;

public class UniqueSubstringGivenLength {
	
	public static void main(String[] args) {
		
		
		/*
		 * "9. Find out unique substring of given length of string. EX: Input - (aab,2)
		 * , Output - aa, ab Input- (aabc,2), Output - aa, ab,bc Input -(abc,1), Output
		 * - a,b,c"
		 */
		
		String str = "aabc";
		int length = 2;
		
		Set<String> set = new HashSet<String>();
		
		for(int i=0;i<=str.length()-length;i++) {
			
			set.add(str.substring(i, i+length));
		}
		
		System.out.println(set);
	}

}
/*
 * ### Time Complexity - The time complexity of this algorithm is (O(n * k)), where (n) is the length of the 
 * string and (k) is the length of the
 * substring. This is because we are iterating over the string and extracting
 * substrings of length (k).
 */
