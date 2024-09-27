package medium;

import java.util.HashMap;
import java.util.Map;

public class Program3_1 {

	public static void main(String[] args) {
		/*
		 * "Implement the method that provided numerator and denominator will return a
		 * string representing fraction's decimal form. Some fractions in decimal form
		 * have cyclic decimal points.
		 *
		 * Examples: 1/2 = 0.5 
		 * 			 1/3 = 0.(3)"
		 */
		
		fractionalDecimal(1,3);
		
	}

	private static void fractionalDecimal(int num, int den) {
		
		
		StringBuilder result = new StringBuilder();
		
		result.append(num/den);
		num = num % den;
		
		if(num!=0)
			result.append(".");
		
		Map<Integer, Integer> map = new HashMap<>();
		
		while(num!=0) {
			
			
			if(map.containsKey(num)) {
				int index = map.get(num);
				result.insert(index,"(");
				result.append(")''");
				break;
			}
			map.put(num, result.length());
			num*=10;
			result.append(num/den);
			num = num % den;
			
		}
		System.out.println(map);
		System.out.println(result);
		
	}

}
