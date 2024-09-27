package com.beginner;

import java.util.Arrays;

public class AddingFractions {
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 3;
		int c = 3;
		int d = 9;
		
		int num = (a * d) + (b *c);
		int den = b *d;
		
		int gcd = gcd(num, den);
		System.out.println((num/gcd)+"/"+(den/gcd));
 
		
		
	}
	
	 // Helper method to compute the greatest common divisor (GCD)
    private static int gcd(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

}
