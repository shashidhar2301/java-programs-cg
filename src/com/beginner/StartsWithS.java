package com.beginner;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StartsWithS {

	public static void main(String[] args) {
		
		
	//	Input: {"apple","sample", "search","cat"}
		//output: { "sample", "search"}
		
		String[] str = {"apple","sample", "search","cat"};
		
		String[] collect = Stream.of(str).filter(s->s.startsWith("s")).toArray(String[]::new);
		System.out.println(Arrays.toString(collect));
		
		
		
		String s1 ="apple";
		
		Map<String, Long> collect2 = Arrays.stream(s1.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
				
		LinkedHashMap<String, Long> collect3 = Arrays.stream(s1.split("")).collect(Collectors.groupingBy(e->e,LinkedHashMap::new, Collectors.counting()));
		System.out.println(collect2);
		System.out.println(collect3);
		
		
		collect3.entrySet().stream().filter(e->e.getValue()>1).forEach(System.out::println);
		
		// Find out if String has all Unique Characters
		
		
		
	}
}
