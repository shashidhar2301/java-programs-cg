package simple;

import java.util.HashMap;
import java.util.Map;

public class Program14 {

	public static void main(String[] args) {

		/*
		 * 14. How to Count occurrences of each character in a String in java
		 * 
		 */
		
		System.out.println(occurenceOfChar("abcdab"));
	}

	private static Map<Character,Integer> occurenceOfChar(String str) {
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(char c : str.toLowerCase().toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		return map;
	}

}
