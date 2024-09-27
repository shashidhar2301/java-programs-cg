package com.beginner;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Java8ArrayProg {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,43,15,66,87,89,9,10,22,34,23,89,54,1);
		int[] arr = {1,43,15,66,87,89,9,10,22,34,23,89,54,1};
		
		List<Integer> singleDigits =  Arrays.stream(arr).boxed().filter(e-> e>10 ).collect(Collectors.toList());
		
		Optional<Integer> first = list.stream().distinct().findFirst();
		System.out.println(first.get());
		
		List<Integer> singleDigit = list.stream().filter(e-> e >=0 && e<10).toList();
		System.out.println("singleDigit---"+singleDigit);
		
		List<Integer> list2 = list.stream().filter(e->e%2==0).toList();
		System.out.println(list2);
		
		Map<String, List<Integer>> collect = list.stream().collect(Collectors.groupingBy(e->e%2==0?"even":"odd"));
		System.out.println(collect);
		
		List<Integer> list3 = list.stream().filter(Java8ArrayProg::primeCheck).toList();
		System.out.println(list3);
	}
	
	static boolean primeCheck(int number){
		
		if (number <= 1) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) return false;
        }
        return true;
	}

}
