package medium;

import java.util.ArrayList;
import java.util.List;

public class Program15 {
	
	public static void main(String[] args) {
		/*
		 * 15.Write a program to print all permutations of a given string.
		 * 
		 */
		
		String str = "abc";
		List<String> list = new ArrayList();
		
		permutations(str, "", list);
		System.out.println(list);
	}

	private static List<String>  permutations(String str, String result, List<String> list) {
		
		if(str.isEmpty()) {
			list.add(result);
		}
		
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			String temp = str.substring(0,i) + str.substring(i+1);
			permutations(temp,result+ch, list);
		}
		return list;
		
	}

}
