package com.beginner;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class MaxNumber {
	
	public static void main(String[] args) {
		
		String[] array = {"3","34","7"};
		
		
		Arrays.sort(array,Comparator.reverseOrder());
		System.out.println(array);
		
		Stream.of(array).forEach(System.out::print);
	}

}
