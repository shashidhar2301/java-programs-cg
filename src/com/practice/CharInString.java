package com.practice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CharInString {

	public static void main(String[] args) {
		
		//13. Write the program to get second non-repeated char from string
		String str = "shashidhar";
		
		Map<Character,Integer> map = new LinkedHashMap<>();
		
		for(int i=0;i<str.length();i++) {
			
			if(map.containsKey(str.charAt(i)))
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			else
				map.put(str.charAt(i), 1);
			
		}
		//System.out.println(map);
		int count =0;
		for(Entry e : map.entrySet()) {
			
			if(e.getValue().equals(1)) {
				count++;
				
				if(count==2)
				{
					System.out.println(e.getKey());
					break;
				}
			}
			
		}
		
		/*
		 * ### Time and Space Complexity
		 * 
		 * - **Time Complexity**: - **Counting Characters**: (O(n)), where (n) is
		 * the length of the string. Each character is processed once to build the
		 * frequency map. - **Finding the Second Non-Repeated Character**: (O(n)).
		 * Each character is processed again to check its frequency.
		 ** 
		 * Overall Time Complexity**: (O(n))
		 * 
		 * - **Space Complexity**: - **HashMap Storage**: (O(k)), where (k) is the
		 * number of unique characters in the string. In the worst case, this could be
		 * (O(n)) if all characters are unique.
		 ** 
		 * Overall Space Complexity**: (O(k)) or (O(n))
		 * 
		 * This approach ensures that the problem is solved efficiently, with clear
		 * handling of edge cases where fewer than two non-repeated characters are
		 * present.
		 */
		
	}
}
