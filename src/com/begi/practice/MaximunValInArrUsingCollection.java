package com.begi.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaximunValInArrUsingCollection {
	
	public static void main(String[] args) {
		
		
		int[] arr1= {1,29,3,4,5};
		
		List<Integer> collect = Arrays.stream(arr1).boxed().collect(Collectors.toList());
		
		Optional<Integer> reduce = collect.stream().reduce((e1,e2) -> e1 < e2 ? e1 : e2);
		System.out.println(reduce);
		
	}

}
