package com.beginner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrderNumbersAndUpperCase {

	public static void main(String[] args) {
		//Input: {"1","A","B","C","2","3","F","V","5"} 
		//order all the numbers then Uppercase letters, expected output: {"1","2","3","4","5","A","B","C","F","V"}
		
		String[] arr = {"1","Z","A","B","C","2","3","F","V","5"} ;
		List<String> numbers = new ArrayList<>();
		List<String> charcters = new ArrayList<>();
		
		for(String s : arr) {
			
			if(Character.isDigit(s.charAt(0))) {
				numbers.add(s);
			}else
				charcters.add(s);
			
		}
		numbers.addAll(charcters);
		
		Collections.sort(numbers);
		System.out.println(numbers);
		
		String[] array = numbers.stream().map(e->e.toString()).toArray(String[]::new);
		System.out.println(Arrays.toString(array));
		}
	
		/*
		 * ### Time Complexity - **Separating numbers and letters**: (O(n)), where
		 * (n) is the length of the input array. - **Sorting numbers**: (O(k log
		 * k)), where (k) is the number of digits. - **Sorting letters**: (O(m log
		 * m)), where (m) is the number of letters. - **Combining sorted numbers and
		 * letters**: (O(k + m)).
		 * 
		 * Overall time complexity: (O(n + k log k + m log m)), which simplifies to
		 * (O(n log n)) in the worst case.
		 */
}
