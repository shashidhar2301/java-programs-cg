package com.notepad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThirdLargetNumberFromList {

	public static void main(String[] args) {
		
		//Find the 3rd largest number in a list of integers
		
		List<Integer> list = new ArrayList<>(Arrays.asList(1,24,5,9,234));
		
		
		Collections.sort(list);
		
		//System.out.println(list.get(2));
		
		int firstMax = 0;
		
		int num = getThirdMax(list);
		
	}

	private static int getThirdMax(List<Integer> list) {
		// TODO Auto-generated method stub
		/*
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;
		
		for(int i : list) {
			if(i > first) {
				third = second;
				second = first;
				first = i;
			}else if(i > second && i!=first) {
				third = second;
				second = i;
			}else if(i > third && i!=second) {
				third = i;
			}
			
			
				
				
		} */
		Integer highest = Integer.MIN_VALUE;
        Integer secondHighest = Integer.MIN_VALUE;
		 for (int num : list) {
	            if (num > highest) {
	                secondHighest = highest;
	                highest = num;
	            } else if (num > secondHighest && num < highest) {
	                secondHighest = num;
	            }
	        }
		System.out.println(secondHighest);
		return 0;
	}
}
