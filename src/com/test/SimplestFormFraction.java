package com.test;

public class SimplestFormFraction {

	public static void main(String[] args) {

		/*
		 * "26. Add two fraction a/b and c/d and print answer in simplest form.
		 * 
		 * Examples :
		 * 
		 * Input: 1/2 + 3/2 Output: 2/1
		 * 
		 * Input: 1/3 + 3/9 Output: 2/3
		 * 
		 * Input: 1/5 + 3/15 Output: 2/5"
		 * 
		 */

		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;

		int num = (a * d) + (b * c);
		int den = b * d;

		int gcd = formFraction(num, den);
		System.out.println(gcd);
		System.out.println((num / gcd) + "/" + (den / gcd));
	}

	private static int formFraction(int num, int den) {
		int temp = 0;
		while (den != 0) {
			temp = den;
			den = num % den;
			num = temp;
		}

		return num;
	}
	// recursive approach for gcd calculation
	/*
	 * private static int gcd(int a, int b) { if (b == 0) { return a; } return
	 * gcd(b, a % b); }
	 */

	/*
	 * Let's analyze the time complexity for the given approach.
	 * 
	 * ### Code Breakdown:
	 * 
	 * 1. **Numerator and Denominator Calculation:** - `int num = (a*d)+(b*c);` -
	 * `int den = b*d;` - Both these operations are simple arithmetic operations,
	 * and their time complexity is (O(1)).
	 * 
	 * 2. **GCD Calculation using `formFraction` method:** - The method uses the
	 * Euclidean algorithm to calculate the GCD, which involves a loop. - The time
	 * complexity of the Euclidean algorithm is (O(log(min(num},
	 * den})))).
	 * 
	 * 3. **Simplifying the Fraction:** - `int gcd = formFraction(num, den);` -
	 * `System.out.println((num/gcd)+"/"+(den/gcd));` - The division operations here
	 * are (O(1)) since they involve single arithmetic operations.
	 * 
	 * ### Overall Time Complexity: The dominant factor in the time complexity is
	 * the GCD calculation using the Euclidean algorithm.
	 * 
	 * - **Time Complexity:** (O(log(min(num}, den}))))
	 */

}
