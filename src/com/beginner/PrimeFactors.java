package com.beginner;

public class PrimeFactors {
	
	public static void main(String[] args) {
		
		
		int n = 25;
		
		/*
		 * while(i%2 ==0) { System.out.println("2,"); i = i/2; }
		 * 
		 * for(int j=3;j<=Math.sqrt(i);j+=2) {
		 * 
		 * while(i%j==0) { System.out.println(j); i/=j; } }
		 */
		 
 
		while (n%2==0)
        {
            System.out.print(2 + " ");
            n /= 2;
        }
 
        // n must be odd at this point.  So we can
        // skip one element (Note i = i +2)
        for (int i = 3; i <= Math.sqrt(n); i+= 2)
        {
            // While i divides n, print i and divide n
            while (n%i == 0)
            {
                System.out.print(i + " ");
                n /= i;
            }
        }
        
        if (n > 2)
            System.out.print(n);
	}

}
