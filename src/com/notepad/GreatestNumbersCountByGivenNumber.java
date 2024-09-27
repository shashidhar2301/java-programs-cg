package com.notepad;

import java.util.Arrays;

public class GreatestNumbersCountByGivenNumber {
	
	public static void main(String[] args) {
		
		//Question 8th:- count the array number whose value greater then 100 `by using Java8 Stream ?
		 
		int[] arr = new int[]{1,23,00,40,23,68};
		
		long count = Arrays.stream(arr).filter(e-> e> 100).count();
		System.out.println(count);
		
	}

}
