package com.begi.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Jav8OperationsOnNumbers {
	
	public static void main(String[] args) {
		
		/*
		21. Java 8:  List<Integer> numbers= Arrays.asList(1,43,15,66,87,89,9,10,22,34,23,89,54);

		// Java 8 
		   // 1. get only single digit number
		   //2.  {even: evennumber, odd: oddnumbers}
		   //3. get all prime numbers
		*/
		
		 List<Integer> numbers= Arrays.asList(1,43,15,66,3,87,89,9,10,22,34,23,89,54);
		 
		 List<Integer> singleDigti = numbers.stream().filter(e-> e < 10).collect(Collectors.toList());
		 System.out.println(singleDigti);
		 
		 Map<String, List<Integer>> collect = numbers.stream().collect(
				 Collectors.groupingBy(e->e%2 == 0 ? "even" : "odd")
				 );
		 
		 System.out.println(collect);
		 
		 List<Integer> primeNumber = numbers.stream().filter(Jav8OperationsOnNumbers::primeNumber).toList();
		 System.out.println(primeNumber);
		 
	}
	
	 

	private static boolean primeNumber(Integer num) {
		
		if(num <= 1)
			return false;
		if(num%2 == 0)
			return false;
		
		for(int i=3;i<num/2;i=i+2) {
			if(num%i ==0)
				return false;
			
		}
		
		return true;
	}

}
