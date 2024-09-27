package simple;

import java.util.HashMap;

public class Program17 {

	public static void main(String[] args) {
		/*
		 * "17. Find out the numerology number for the given name as mentioned below:
		 * Each alphabet represented with one number as given : A,I,J,Q,Y - 1 B,K,R-2
		 * C,G,L,S - 3 D,M,T - 4 E,H,N,X -5 U,V,W-6 O,Z-7 F-P-8 Ex. If input String is
		 * ""S. KANAPATHY"" then output should be 4. S. KANAPATHY ==>
		 * 3+2+1+5+1+8+1+4+5+1=31 (3+1) = 4"
		 * 
		 */

		String str = "S. KANAPATHY";
		int count = 0;

		HashMap<Character, Integer> hm = new HashMap<>();

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
		

		for (char ch : str.toUpperCase().replaceAll("[^a-zA-Z]", "").toCharArray()) {
			count+= hm.get(ch);
		}
		
		
		
		System.out.println(makeNumberAsSigle(count));
	}

	private static int makeNumberAsSigle(int count) {
		
		int sum = 0;
		
		while(count>0) {
			int temp = count%10;
			sum = sum + temp;
			count/=10;
		}
		if(sum>10)	
			return makeNumberAsSigle(sum);
		else
			return sum;
		
		
	}

}
