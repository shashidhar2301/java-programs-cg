package test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProgramOne {

	public static void main(String[] args) {

		/*
		 * 21. Java 8: List<Integer> numbers=
		 * Arrays.asList(1,43,15,66,87,89,9,10,22,34,23,89,54); 
		 * // Java 8 //
		 *  1. get only
		 * single digit number //
		 * 2. {even: evennumber, odd: oddnumbers} //
		 * 3. get all
		 * prime numbers
		 */
		List<Integer> numbers= Arrays.asList(1,43,15,66,87,89,9,10,22,34,23,89,54); 
		
		List<Integer> singleDigits = numbers.stream().filter(e-> e<10).toList();
		System.out.println(singleDigits);
		
		Map<String, List<Integer>> evenAndOdd = numbers.stream().collect(Collectors.groupingBy(e->e%2==0? "even" : "odd"));
		System.out.println(evenAndOdd);
		
		List<Integer> primeNumbers = numbers.stream().filter(ProgramOne::checkPrime).toList();
		System.out.println(primeNumbers);
		
		
	}
	
	public static boolean checkPrime(int num) {
		
		int count = 0;
		if(num==1 || num ==2)
			return true;
		if(num%2==0)
			return false;
		
		for(int i=3;i<=num;i+=2) {
			if(num%i == 0) {
				count++;
			}
		}
		if(count !=1)
			return false;
		return true;
	}
}
