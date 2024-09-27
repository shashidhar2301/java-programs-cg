package com.beginner;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String str = "greet the day user greet good day";
		
		// input: greet the day user greet good day
		 //output:greet the day user good
		 
		String collect = Arrays.stream(str.split(" ")).distinct().collect(Collectors.joining(" "));
		System.out.println(collect);
		
		Set<String> set = new LinkedHashSet<>();
		
		for(String s : str.split("\\s+")) {
			set.add(s);
		}
		
		
		String join = String.join(" ", set);
		System.out.println(join);
		
	}
}
