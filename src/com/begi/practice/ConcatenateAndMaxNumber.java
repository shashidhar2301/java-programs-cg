package com.begi.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ConcatenateAndMaxNumber {
	
	public static void main(String[] args) {
		
		
		//List of Integer let say {9,7,4,30,5} , concatenate each element and find out the maximum number
		
		//List<Integer> li = Arrays.asList(9,7,4,30,5);
		
		List<Integer> li = new ArrayList<>(Arrays.asList(9,7,4,89,30,90,212,8));
		
		String[] arr = li.stream().map(String::valueOf).toArray(String[]::new);
		
		
		Collections.sort(Arrays.asList(arr), (a,b) -> (b+a).compareTo(a+b));
		
		for(String s: arr) {
			System.out.print(s);
		}
	}

}
