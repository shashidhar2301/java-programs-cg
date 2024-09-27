package com.beginner;

public class PascalTriangle {
	
	public static void main(String[] args) {
		
		int n = 4;
		
		for(int line=1;line<=n;line++) {
		//	System.out.println(i);
			int C = 1;
            for (int i = 1; i <= line; i++) {
 
                // The first value in a line is always 1
                System.out.print(C + " ");
                C = C * (line - i) / i;
            }
            System.out.println();
		}
		
		 int value = getValueAt(3,0);
	        System.out.println("Value at (" + 3 + "," + 0 + ") is: " + value);
		
	}
	
	  public static int factorial(int n) {
	        if (n == 0) return 1;
	        int fact = 1;
	        for (int i = 1; i <= n; i++) {
	            fact *= i;
	        }
	        return fact;
	    }

	    public static int binomialCoefficient(int n, int k) {
	        return factorial(n) / (factorial(k) * factorial(n - k));
	    }
	    
	    public static int getValueAt(int row, int col) {
	        return binomialCoefficient(row, col);
	    }

}
