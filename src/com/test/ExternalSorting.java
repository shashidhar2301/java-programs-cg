package com.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class ExternalSorting {

	public static void main(String[] args) {

		/*
		 * "24. Problem Statement:
		 *
		 * Given a list of Strings, and an external order in which it needs to be
		 * sorted, Sort the given list of *strings. For example: Input Strings :
		 * """"Ajay"""", """"Raja"""", """"Keshav"""", """"List"""", """"Set"""",
		 * """"Elephant"""", """"Drone"""" Sort order: TESARDLK Sorted Strings:
		 * """"Elephant"""", """"Set"""",""""Ajay"""", """"Raja"""",
		 * """"Drone"""",""""List"""",""""Keshav"""""
		 * 
		 */
		
		String[] arr = {"Ajay", "Raja", "Keshav","Anu", "List", "Set","Elephant", "Drone" };
		String externalSortStr = "TESARDLK";
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(int i=1;i<externalSortStr.length();i++) {
			map.put(externalSortStr.charAt(i), i);
		}
		
		Comparator<String> sort = (s1,s2)->{
			
			int length = Math.min(s1.length(), s2.length());
			
			for(int i=0;i<length;i++) {
				
				int index1 = map.getOrDefault(s1.charAt(i),Integer.MAX_VALUE);
				int index2 = map.getOrDefault(s2.charAt(i),Integer.MAX_VALUE);
				
				if(index1!=index2)
					return index1 - index2;
						
				
			}
			
			return s1.length()-s2.length();
			
		};
		
		Collections.sort(Arrays.asList(arr), sort);
		
		System.out.println(Arrays.toString(arr));
		
	}
	/*
	 * ### Time Complexity: - **Creating the `rankMap`**: O(n), where `n` is the
	 * length of the `order` string. - **Sorting**: The sorting operation has a time
	 * complexity of O(m * k * log(m)), where `m` is the number of strings and `k`
	 * is the average length of the strings. - **Total Time Complexity**: 
	 * O(n + m * k * log(m)).
	 */
}
