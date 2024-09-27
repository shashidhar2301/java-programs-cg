package com.notepad;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class GroupAnagramsTogether {

	public static void main(String[] args) {

		/*
		 * Given an array of strings, group anagrams together. Example: Input: ["eat",
		 * "tea", "tan", "ate", "nat", "bat"] Output: ["ate", "eat", "tea"], ["nat",
		 * "tan"], ["bat"]
		 */

		String[] arr = { "eat", "tea", "tan", "ate", "nat", "bat" };

		groupingAnagrams(arr);
	}

	private static void groupingAnagrams(String[] arr) {
		// TODO Auto-generated method stub

		Map<String, Set<String>> map = new LinkedHashMap<>();
		
		for (String s : arr) {
			char[] ch = s.toCharArray();
			Arrays.sort(ch);

			
			if(map.containsKey(Arrays.toString(ch))) {
				Set<String> set = map.get(Arrays.toString(ch));
				set.add(s);
			}
			else {
				Set<String> set = new HashSet<String>();
				set.add(s);
				map.put(Arrays.toString(ch), set);
			}
		//	
				

		}

	//	System.out.println(map);
		
		map.values().stream().forEach(e->System.out.println(e));
	}
}
