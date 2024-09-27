package com.test;

import java.util.Arrays;

public class LongestOccuringCharIndexAndCount {

	public static void main(String[] args) {

		/*
		 * "5. Question: For the given string such as ""aabbbbbcc"" print the longest
		 * occurring character,index and number of times it occurs. Ex: longest
		 * occurring character is b and length is 5 at index 2."
		 * 
		 */
		
		String str = "aabbcccc";
		
		int[] arr = getIndexAndCount(str);
		System.out.println(Arrays.toString(arr));
	}

	private static int[] getIndexAndCount(String str) {
		// TODO Auto-generated method stub
		
	int maxCount = 1;
		int count = 1;
		int index = 0;
		for(int i=1;i<str.length();i++) {
			
			if(str.charAt(i) == str.charAt(i-1)) {
				count++;
				if(count>maxCount) {
					maxCount = count;
					index = i - count + 1;
				}
			}else
				count = 1;
		}
		
		return new int[] {maxCount, index};
	}
}
