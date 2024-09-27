package simple;

import java.util.HashMap;
import java.util.Map;

public class Program13 {

	public static void main(String[] args) {

		/*
		 * 13. Write the program to get second non-repeated char from string
		 * 
		 */
		
		System.out.println(secondNonRepeatedChar("apple"));
		System.out.println(secondNonRepeatedChar("aabb"));
	}

	private static char secondNonRepeatedChar(String str) {
		
		Map<Character,Integer> map = new HashMap<>();
		int count = 0;
		
		for(char c : str.toLowerCase().toCharArray()) {
			
			if(map.containsKey(c))
				map.put(c, map.get(c)+1);
			else
				map.put(c, 1);
		}
		
		for(char c : str.toLowerCase().toCharArray()) {
			
			if(map.get(c) == 1)
				count++;
			
			if(count == 2)
				return c;
		}
		 return '\0';
		
	}

}
