package simple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program25 {

	public static void main(String[] args) {

		/*
		 * 25. Input: {'1','A','B','C','2','3','F','V','5'} order all the numbers then
		 * Uppercase letters, expected output: {'1','2','3','4','5','A','B','C','F','V'}
		 * 
		 */
		
		arrangeNumberAndCharacters(new char[]{'1','A','B','C','2','3','F','V','5'});
	}

	private static void arrangeNumberAndCharacters(char[] arr) {
		
		List<String> number = new ArrayList<>();
		List<String> 	upperCase = new ArrayList<>();
		
		for(char c : arr) {
			
			if(Character.isLetter(c))
				upperCase.add(String.valueOf(c));
			else if(Character.isDigit(c))
				number.add(String.valueOf(c));
		}
		
		
		Collections.sort(number);
		Collections.sort(upperCase);
		
		number.addAll(upperCase);
		
		System.out.println(number);
		
	}
}
