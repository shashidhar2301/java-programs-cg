package com.begi.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GitSample {

	public static void main(String[] args) {

		/*
		 * input =[2,3,null,45, 78, 90,null,12] Output=[[2,3],[45,78,90],[12]]
		 */

		List<Integer> list = Arrays.asList(2, 3, null, 45, 78, 90, null, 12);
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> temp = new ArrayList<Integer>();
		//int length = list.size();
		for (Integer i : list) {
			// List<Integer> temp = new ArrayList<Integer>();
			if (i == null) {
				//System.out.println(temp);
				result.add(new ArrayList<>(temp));
				//System.out.println(result);
				temp.clear();
				// result.add(temp);

			} else if (i != null) {
				temp.add(i);
			}
		}
		// System.out.println(temp);
		result.add(temp);
		System.out.println(":::"+result);

		/*
		 * Input: = "Sample word document" 
		 * output: Count of each repeated characters.
		 */
		
		String str  = "Sample word document";
		
		Map<String, Long> map = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		//HashMap<String, Long> collect = Arrays.stream(str.split("")).collect(Collectors.groupingBy(e->e, HashMap::new, Collectors.counting()));
		
		
	//	map.entrySet().stream().filter(e-> e.getValue()>1 && !e.getKey().equals(" ")).forEach(System.out::println);
		
		
		LinkedHashMap<String, Long> collect = Arrays.stream(str.split("")).collect(Collectors.groupingBy(e->e, LinkedHashMap::new, Collectors.counting()));
		//collect.entrySet().stream().forEach(e->System.out.println(e.getKey()+":"+e.getValue()));
	}
}
