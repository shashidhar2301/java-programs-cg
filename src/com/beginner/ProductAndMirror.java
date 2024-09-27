package com.beginner;

public class ProductAndMirror {
	
	public static void main(String[] args) {
		
		int prod = 252;
		
		for(int x=1;x<prod/2;x++) {
			
			if(prod%x == 0) {
				int y = prod/x;
				//System.out.println(x+":"+y);
				int z = 0;
				while(y!=0) {
					int temp = 0;
					temp = y%10;
					z = z * 10 + temp;
					y/=10;
					
				}
				//System.out.println(x+":"+z);
				if(x==z)
					System.out.println(x+":"+z);
//				else
//					System.out.println("noo");
			}
		}
		
		
		
		
	//	reverse();
	}
	
	static void reverse() {
		
		int num =123;
		int target = 0;
		int temp = 0;
		while(num!=0) {
			
			temp = num%10;
			target = target * 10 + temp;
			num/=10;
			
		}
		System.out.println(target);
	}
	/* Certainly! Let's analyze the time complexity of the given Java program:

	1. **Main Method**:
	   - The main method simply calls the `findMirrorNumbers` method, which doesn't affect the time complexity significantly.

	2. **findMirrorNumbers Method**:
	   - This method iterates from (1) to (sqrt{text{product}}). The loop runs (sqrt{text{product}}) times.
	   - For each iteration, it checks if (X) is a factor of the product and calculates (Y). Both these operations are (O(1)).
	   - It then calls `isMirror`, which involves reversing a number. 

	3. **isMirror Method**:
	   - This method calls `reverseNumber`, which is (O(d)), where (d) is the number of digits in (X).

	4. **reverseNumber Method**:
	   - The reverseNumber method processes each digit of the number. The number of digits in a number (n) is (O(log n)).

	### Overall Time Complexity:
	- The outer loop in `findMirrorNumbers` runs (sqrt{text{product}}) times.
	- The `reverseNumber` method runs in (O(log X)) time for each call, where (X) can be as large as (sqrt{text{product}}).
	- Therefore, the time complexity for each iteration inside the loop in `findMirrorNumbers` is (O(log X)).

	Combining these, the overall time complexity of the program is:

	[ O(sqrt{text{product}} cdot log X) ]

	Since (X leq sqrt{text{product}}), the time complexity can also be expressed as:

	[ O(sqrt{text{product}} cdot log(sqrt{text{product}})) ]
	[ = O(sqrt{text{product}} cdot frac{1}{2} log(text{product})) ]
	[ = O(sqrt{text{product}} cdot log(text{product})) ]

	Thus, the overall time complexity is:

	[ O(sqrt{text{product}} cdot log(text{product})) ] */
}
