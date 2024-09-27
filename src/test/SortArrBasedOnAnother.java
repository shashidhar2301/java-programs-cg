package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SortArrBasedOnAnother {

	public static void main(String[] args) {
		/*
		 * 27. ."Given two arrays arr1 and arr2, the elements of arr2 are distinct, and
		 * all elements in arr2 are also in arr1. // Sort the elements of arr1 such that
		 * the relative ordering of items in arr1 are the same as in arr2. Elements that
		 * do not appear in arr2 should be placed at the end of arr1 in ascending order.
		 * 
		 * 
		 * 
		 * // Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6] // Output:
		 * [2,2,2,1,4,3,3,9,6,7,19]"
		 */
		
		int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19}, arr2 = {2,1,4,3,9,6};
		//int[] result = new int[arr1.length];
		Arrays.sort(arr1);
		List<Integer> result = new ArrayList<>();
		
		
		Map<Integer,Integer> map = new LinkedHashMap<>();
		
		for(int i : arr1) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		
		for(int i : arr2) {
			int count = map.get(i);
			for(int j=0;j<count;j++) {
				result.add(i);
			}
			map.remove(i);
		}
		
		for(Map.Entry<Integer,Integer> e : map.entrySet()) {
			result.add(e.getKey());
		}
		
		System.out.println(result);
	}
}
