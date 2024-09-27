package com.beginner;

import java.util.HashMap;

public class NumerologyNumber {
	
	public static void main(String[] args) {
		
		/*
		 * "17. Find out the numerology number for the given name as mentioned below:
		 * Each alphabet represented with one number as given : A,I,J,Q,Y - 1 B,K,R-2
		 * C,G,L,S - 3 D,M,T - 4 E,H,N,X -5 U,V,W-6 O,Z-7 F-P-8 Ex. If input String is
		 * ""S. KANAPATHY"" then output should be 4. S. KANAPATHY ==>
		 * 3+2+1+5+1+8+1+4+5+1=31 (3+1) = 4"
		 */
		
		HashMap<Character,Integer> hm = new HashMap<>();
		
		hm.put('A', 1);
		hm.put('I', 1);
		hm.put('J', 1);
		hm.put('Q', 1);
		hm.put('Y', 1);
		hm.put('B', 2);
		hm.put('K', 2);
		hm.put('R', 2);
		hm.put('C', 3);
		hm.put('G', 3);
		hm.put('L', 3);
		hm.put('S', 3);
		hm.put('D', 4);
		hm.put('M', 4);
		hm.put('T', 4);
		hm.put('E', 5);
		hm.put('H', 5);
		hm.put('N', 5);
		hm.put('X', 5);
		hm.put('U', 6);
		hm.put('V', 6);
		hm.put('W', 6);
		hm.put('O', 7);
		hm.put('Z', 7);
		hm.put('F', 8);
		hm.put('P', 8);
		
		String str = "S. KANAPATHY";
		String newStr = str.replaceAll("[^a-zA-Z]", "");
		
		System.out.println(newStr);
		int num = 0;
		
		for(Character c: newStr.toUpperCase().toCharArray()) {
			
			if(hm.containsKey(c))
				num+=hm.get(c);
		}
		
		
		//formSingleDigit(566);
		while(num>=10) {
			num = formSingleDigit(num);
		}
		System.out.println(num);
	}

	private static int formSingleDigit(int num) {
		int sum =0;
		while(num!=0) {
			sum = sum + num%10;
			num/=10;
		
		}
		if(sum > 10)
			return formSingleDigit(sum);
		
		return sum;
	}
	/*
	 * ### Time Complexity
	 * 
	 * - **Mapping and Summing**: - Constructing the mapping takes constant time,
	 * (O(1)), as the size of the map is fixed and small. - Iterating over the
	 * name to calculate the sum takes (O(n)), where (n) is the length of the
	 * name.
	 * 
	 * - **Reducing to Single Digit**: - This step requires a few iterations
	 * proportional to the number of digits in the sum, which is constant and does
	 * not depend on (n).
	 ** 
	 * Overall Time Complexity**: (O(n))
	 * 
	 * ### Space Complexity
	 * 
	 * - **Space Complexity**: - The space used for the `letterToNumber` map is
	 * (O(1)) because it has a fixed number of entries. - The additional space
	 * used for variables is also constant.
	 ** 
	 * Overall Space Complexity**: (O(1))
	 * 
	 * This program efficiently calculates the numerology number by leveraging a
	 * fixed mapping and simple arithmetic operations.
	 */

}
