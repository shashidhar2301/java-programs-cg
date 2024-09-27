package test;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FirstNonRepeatingChar {
	
	public static void main(String[] args) {
		
		List<String> arr = Arrays.asList("array","apple","rat");
		
		for(String s: arr) {
			char ch = nonRepeatingChar(s);
			System.out.println(ch);
		}
	}

	private static char nonRepeatingChar(String s) {
		
		Map<Character, Integer> map= new LinkedHashMap<>();
		
		for(int i=0;i<s.length();i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
		}
		
		for(Map.Entry<Character, Integer>  e: map.entrySet()) {
			if(e.getValue()==1)
				return e.getKey();
		}
		return ' ';
	}

}
