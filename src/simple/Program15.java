package simple;

import java.util.HashSet;
import java.util.Set;

public class Program15 {

	public static void main(String[] args) {

		/*
		 * 15. How to calculate total number of characters in the String?
		 * 
		 */
		
		System.out.println(totalNumberOfChar("aabcdfaabd"));
		
	}

	private static int totalNumberOfChar(String str) {
		
		Set<Character> set = new HashSet<>();
		
		for(char c : str.toLowerCase().toCharArray())
			set.add(c);
		
		return set.size();
		
	}

}
