package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomSortStrings {

	public static void main(String[] args) {
		/*
		 * 24. Problem Statement:
		 *
		 * Given a list of Strings, and an external order in which it needs to be
		 * sorted, Sort the given list of *strings. For example: Input Strings :
		 * ""Ajay"", ""Raja"", ""Keshav"", ""List"", ""Set"", ""Elephant"", ""Drone""
		 * Sort order: TESARDLK Sorted Strings: ""Elephant"", ""Set"",""Ajay"",
		 * ""Raja"", ""Drone"",""List"",""Keshav""
		 */
		
		List<String> arr = Arrays.asList("Ajay","Uma", "Raja", "Keshav","Umay", "List", "Set", "Elephant", "Drone");
		String externalSort = "TESARDLK";
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i=0;i<externalSort.length();i++) {
			map.put(externalSort.charAt(i), i);
		}
		
		Comparator<String> custom = (s1,s2)->{
			int min = Math.min(s1.length(), s2.length());
			for(int i=0;i<min;i++) {
				char c1 =  s1.charAt(i);
				char c2 = s2.charAt(i);
				
				int index1 = map.getOrDefault(c1, Integer.MAX_VALUE);
				int index2 = map.getOrDefault(c2, Integer.MAX_VALUE);
				
				if(index1!=index2)
					return index1 - index2;
			}
			return s1.length()-s2.length();
		};
		
		Collections.sort(arr, custom);
		
		System.out.println(arr);
	}

}
