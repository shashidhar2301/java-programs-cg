package com.beginner;

public class Pascal {
	
	public static void main(String[] args) {
		int num =4;
		
		for(int i=1;i<=num;i++) {
			int k = 1;
			//System.out.print(" ");
			for(int j=1;j<=i;j++) {
				System.out.print(" "+k);
				k = k * (i-j)/j;
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
