package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramsGroup {

	public static void main(String[] args) {

		/*
		 * "13. Given a list of words, group them by anagrams i/p: List of
		 * "cat","dog", "god" o/p: A set of sets of Anagrams:
		 * {{"cat"},{"dog","god"}}"
		 * 
		 */

		List<String> list = Arrays.asList("cat", "dog", "god","actn");
		Map<String, List<String>> map = new HashMap<>();
		
		for (String s : list) {
			char[] charArray = s.toCharArray();
			Arrays.sort(charArray);
			
			if (map.containsKey(Arrays.toString(charArray))) {
				List<String> existingList = map.get(Arrays.toString(charArray));
				existingList.add(s);
			} else {
				List<String> subArr = new ArrayList<String>();
				subArr.add(s);
				map.put(Arrays.toString(charArray), subArr);
				
			}
			
		}
		map.entrySet().stream().forEach(e->System.out.println(e.getValue()));
	}

}
