package medium;

import java.util.ArrayList;
import java.util.List;

public class Program1 {

	public static void main(String[] args) {

		/*
		 * "1.. Print all perfect numbers between 1 to 100. exp: Perfect number is a
		 * positive integer which is equal to the sum of its proper positive divisors.
		 * For example: 6 is the first perfect number Proper divisors of 6 are 1, 2, 3
		 * Sum of its proper divisors = 1 + 2 + 3 = 6. Hence 6 is a perfect number."
		 * 
		 */
		
		List<Integer> result =  getPerfectNumbers(100);
		System.out.println(result);
		//positiveDivisors(28);
	}

	private static List<Integer> getPerfectNumbers(int num) {
		
		List<Integer> result = new ArrayList<>(); 
		
		for(int i=1;i<=num;i++) {
			
			if(positiveDivisors(i)) {
				result.add(i);
			}
			
		}
		return result;
		
	}

	private static boolean positiveDivisors(int num) {
		int sum = 0;
		
		for(int i=1;i<=num/2;i++) {
			if(num%i==0)
				sum+=i;
		}
		return sum==num;
	}

}
