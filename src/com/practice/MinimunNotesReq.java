package com.practice;

public class MinimunNotesReq {

	public static void main(String[] args) {
		/*
		 * "23. You have 2 curency notes {100,500}. We need to make Rs 1200 out of these
		 * notes. How many minimum notes required to get rs 1200."
		 * 
		 */
		int amount = 1000;
		int[] arr = new int[] {100,500};
		int count  = minNotes(arr, amount);
		System.out.println(count);
	}

	private static int minNotes(int[] arr,int amount) {
		
		int count = 0;
		
		for(int i=arr.length-1;i>=0;i--) {
			
			count+= amount/ arr[i];
			amount%=arr[i];
			//System.out.println(count);
		}
		
		return count;
	}
}
