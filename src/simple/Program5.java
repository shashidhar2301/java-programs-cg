package simple;

import java.util.HashSet;
import java.util.Set;

public class Program5 {

	public static void main(String[] args) {
		/*
		 * "5. Write a program to print . A. all String which starts as ""S"" from the
		 * given String array 
		 * B. Find out if String has all Unique Characters Ex: Input:
		 * {""apple"",""sample"", ""search"",""cat""} output: { ""sample"", ""search""}"
		 * 
		 */
		
		String[] arr = {"apple","sample", "search","cat"};
		
		
		for(String s : arr) {
			if(s.startsWith("s"))
				System.out.println(s);
		}
		
		for(String s : arr) {
			uniqueCharactersString(s);
		}
		
		
	}
	
	public static void uniqueCharactersString(String s){
		
		
		boolean flag = true;
		Set<Character> set = new HashSet<>();
		
		for(char ch : s.toCharArray()) {
			if(set.contains(ch))
				flag = false;
			set.add(ch);
		}
		
		if(flag)
			System.out.println(s+" has unique characters");
	}

}
