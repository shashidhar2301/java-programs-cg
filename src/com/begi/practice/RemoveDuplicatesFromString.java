package com.begi.practice;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromString {
	
	public static void main(String[] args) {
		
		/*
		3. Remove the duplicate words from the given Sentence.
		Ex:
		a) Input: Good day day bye bye
		output: Good day bye
		b) input: greet the day user greet good day
		output:greet the day user good
		*/
		
		String str = "Good day day bye bye";
		String[] arr = str.split(" ");
		
		Set<String> set = new LinkedHashSet<String>();
		
		for(String s : arr) {
			set.add(s);
		}
		
		
	//	System.out.println(String.join(" ", set));
		
		String s = removeDuplicatesUsingList(arr);
		System.out.println(s);
	}

	private static String removeDuplicatesUsingList(String[] arr) {
		
		List<String> list = new ArrayList<>();
		for(String s: arr) {
			if(!list.contains(s)) {
				list.add(s);
			}
		}
		return String.join(" ", list);
	}
	
/*
### Summary:
- Using a `Set` (especially `LinkedHashSet`) is generally more efficient with `O(n)` time complexity for 
removing duplicates and preserving order.
- Using a `List` (especially `ArrayList`) for both tracking and checking duplicates results in `O(n^2)`
 time complexity, which is less efficient for larger datasets.
 */

}
