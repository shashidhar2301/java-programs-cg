package com.beginner;

public class DotProduct {
	
	public static void main(String[] args) {
		
		
		 int[] arr1 = {1, 2, 3, 4, 5};
	     int[] arr2 = {6, 7, 8, 9, 10};
	     
	     
	     int product = 0;
	     
	     if(arr1.length != arr2.length) {
	    	 System.out.println("not in same size");
	     }else {
	    	 
	    	 for(int i=0;i<arr1.length;i++) {
	    		 
	    		 product+=arr1[i]*arr2[i];
	    	 }
	    	 System.out.println(product);
	    	 
	     }

	}

}
