package simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Program21 {

	public static void main(String[] args) {
		/*
		 * "21. Java 8: List<Integer> numbers=
		 * Arrays.asList(1,43,15,66,87,89,9,10,22,34,23,89,54);
		 * 
		 * // Java 8 // 1. get only single digit number //2. {even: evennumber, odd:
		 * oddnumbers} //3. get all prime numbers"
		 * 
		 */
		
		List<Integer> numbers= Arrays.asList(1,43,15,66,87,89,9,-10,22,-34,23,89,54);
		
		System.out.println(getSingleDigits(numbers));
		
		System.out.println(evenOrOdd(numbers));
		
		List<Integer> primes = numbers.stream().filter(Program21::getPrimeNumbers).toList();
		
		System.out.println(primes);
	}

	private static boolean getPrimeNumbers(int num) {
		
		
			int count = 0 ;
			for(int i=1;i<=num/2;i++) {
				if(num%i == 0)
					count++;
			}
			if(count == 1)
				return true;
		 
		
		return false;
	}

	private static Map<String, List<Integer>> evenOrOdd(List<Integer> numbers) {
		
		Map<String, List<Integer>> collect = numbers.stream().collect(Collectors.groupingBy(e->e%2==0?"even":"odd"));
		
		return collect;
	}

	private static List<Integer> getSingleDigits(List<Integer> numbers) {
		
		return numbers.stream().filter(e->e<10 && e>=0).toList();
	}

}
