package com.beginner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LongestNumFromList {
	
	public static void main(String[] args) {
		
		int[] arr = {1,99,9,7,4,33,30,33};
		
		
	//	List<String> array = Arrays.stream(arr).mapToObj(String::valueOf).toList();
	//	System.out.println(array);
		 List<String> stringNumbers = new ArrayList<>();
	        for (Integer number : arr) {
	            stringNumbers.add(number.toString());
	        }
	        
		//Collections.sort(array,(a,b)-> (b+a).compareTo(a+b));
		
		   // Sort the list based on custom comparator
        Collections.sort(stringNumbers, (a, b) -> 
        (b + a).compareTo(a + b));

		
		//System.out.println(stringNumbers);
		
		StringBuilder builder = new StringBuilder();
		
		for(String s :stringNumbers){
			builder.append(s);
		}
		
		System.out.println(builder.toString());
	}
	
	/*
	 * ### Time and Space Complexity
	 * 
	 * - **Time Complexity**: - **Sorting**: (O(n log n)), where (n) is the
	 * number of elements in the list. Sorting is the most time-consuming operation.
	 * - **Concatenation**: (O(n)), where (n) is the total length of the
	 * concatenated string.
	 ** 
	 * Overall Time Complexity**: (O(n log n))
	 * 
	 * - **Space Complexity**: - **Storing Strings**: (O(n cdot m)), where (m)
	 * is the average length of the string representations of the numbers.
	 ** 
	 * Overall Space Complexity**: (O(n cdot m))
	 * 
	 * This approach ensures you get the maximum concatenated number efficiently and
	 * is straightforward to implement.
	 */

}
