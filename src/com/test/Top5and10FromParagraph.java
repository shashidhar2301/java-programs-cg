package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Top5and10FromParagraph {

	public static void main(String[] args) {
		/*
		 * "25. Print the repeated top 5,10 words in decending order from the the below
		 * paragraph. input : """"Sunset is the time of day when our sky meets the outer
		 * space solar winds. There are blue, pink, and purple swirls, spinning and
		 * twisting, like clouds of balloons caught in a whirlwind. The sun moves slowly
		 * to hide behind the line of horizon, while the moon races to take its place in
		 * prominence atop the night sky. People slow to a crawl, entranced, fully
		 * forgetting the deeds that must still be done. There is a coolness, a
		 * calmness, when the sun does set."""" example: the=7, a=4, of=3, to=3, when=2,
		 * There=2, in=2, is=2, sun=2, and=2"""
		 * 
		 */

		String str = "Sunset is the time of day when our sky meets the outer\r\n"
				+ "		 * space solar winds. There are blue, pink, and purple swirls, spinning and\r\n"
				+ "		 * twisting, like clouds of balloons caught in a whirlwind. The sun moves slowly\r\n"
				+ "		 * to hide behind the line of horizon, while the moon races to take its place in\r\n"
				+ "		 * prominence atop the night sky. People slow to a crawl, entranced, fully\r\n"
				+ "		 * forgetting the deeds that must still be done. There is a coolness, a\r\n"
				+ "		 * calmness, when the sun does set.";

		String[] arr = str.replaceAll("[^a-zA-Z\\s]", "").split("\\s+");
		// System.out.println(Arrays.toString(arr));

		// Normalize the text by converting to lowercase and removing punctuation
		// String normalizedText = str.toLowerCase().replaceAll("[^a-zA-Z\\s]", "");

		// Split the text into words
		// String[] arr = normalizedText.split("\\s+");

		Map<String, Integer> map = new HashMap<>();

		for (String s : arr) {
			map.put(s, map.getOrDefault(s,0) + 1);
		}

		List<Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
		
		//Without java 8
		Collections.sort(list, new Comparator<>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o2.getValue(), o1.getValue());
			}
		});
		
		System.out.println(list);
		
		
		//with java 8
		List<Entry<String, Integer>> collect = map.entrySet().stream()
				.sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())).collect(Collectors.toList());

		// System.out.println(collect);

		collect.stream().limit(10).forEach(e -> System.out.println(e.getKey() + "-" + e.getValue()));

		for (Map.Entry<String, Integer> e : map.entrySet()) {
			// System.out.println(e.getKey()+"-"+e.getValue());
		}
		
		String collect2 = list.stream().limit(5).map(e->e.getKey()+"="+e.getValue()).collect(Collectors.joining(","));
		System.out.println(collect2);
	}

	/*
	 * 
	 * ### Time Complexity: - **Normalization**: O(n) where `n` is the length of the
	 * string. - **Splitting**: O(n) - **Counting**: O(m) where `m` is the number of
	 * words. - **Sorting**: O(m log m) - **Overall**: The overall time complexity
	 * is O(m log m) where `m` is the number of words in the input string.
	 * 
	 * This approach efficiently handles the problem and provides the correct
	 * results as per the requirements.
	 */

}
