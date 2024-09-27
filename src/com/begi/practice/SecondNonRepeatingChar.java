package com.begi.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class SecondNonRepeatingChar {
	
	public static void main(String[] args) {
		
		String str = "apple";
		
		char ch = occurence(str);
		System.out.println(ch);
	}

	private static char occurence(String str) {
		
		Map<Character,Integer> hm = new LinkedHashMap<>();
		
		for(char c : str.toCharArray())
			hm.put(c, hm.getOrDefault(c, 0)+1);
		
		System.out.println("Total Character in string is::"+hm.size());
		
		
		int count = 0;
		for(Map.Entry<Character,Integer> e : hm.entrySet()) {
			
			if(e.getValue()==1) 
				count++;
			if(count==2)
				return e.getKey();
		}
		
		return '-';
	}

}
