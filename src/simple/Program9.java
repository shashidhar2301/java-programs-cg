package simple;

import java.util.HashMap;
import java.util.Map;

public class Program9 {
	public static void main(String[] args) {

		/*
		 * "9. Write a program to find first non-repeating character from a input string
		 * Ex: Input : { ""array"", ""apple"", ""rat""} Output: y,a,r"
		 * 
		 */
		
		String[] arr = {"array", "apple", "rat"};
		
		for(String s : arr) {
			char c  = firstNonRepeatingChar(s);
			System.out.println(c);
		}
	}

	private static char firstNonRepeatingChar(String s) {
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(char c : s.toLowerCase().toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		for(char c : s.toLowerCase().toCharArray()) {
			if(map.get(c)==1)
				return c;
		}
		
		return ' ';
	}
}
