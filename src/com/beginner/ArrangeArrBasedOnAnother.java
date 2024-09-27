package com.beginner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ArrangeArrBasedOnAnother {

	public static void main(String[] args) {
		
		
//		27. ."Given two arrays arr1 and arr2, the elements of arr2 are distinct,
		//and all elements in arr2 are also in arr1.

		// Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2.
		//Elements that do not appear in arr2 should be placed at the end of arr1 in ascending order.
		 
		 
		// Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]

		// Output: [2,2,2,1,4,3,3,9,6,7,19]"
		 
		
		int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19}, arr2 = {2,1,4,3,9,6};
		Arrays.sort(arr1);
		
		int[] result = new int[arr1.length];
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		for(int i=0;i<arr1.length;i++) {
			
//			if(!hm.containsKey(arr1[i]))
//				hm.put(arr1[i], 1);
//			else
//				hm.put(arr1[i], hm.get(arr1[i])+1);
			
			hm.put(arr1[i], hm.getOrDefault(arr1[i], 0)+1);
			
		}
		System.out.println(hm);
		int count = 0;
		List<Integer> list = new ArrayList<>();
		for(int j=0;j<arr2.length;j++) {
			
			if(hm.containsKey(arr2[j])) {
				count = hm.get(arr2[j]);
				for(int k=0;k<count;k++) {
					list.add(arr2[j]);
				}
			}
			hm.remove(arr2[j]);
		}
		
	
		
		for(Map.Entry<Integer, Integer> e  : hm.entrySet()) {
			list.add(e.getKey());
		}
		
		System.out.println(list);
		
		int[] array = list.stream().mapToInt(i->i).toArray();
	}
	/*
	### **Total Time Complexity:**
	The overall time complexity of your code is dominated by the sorting step:
	**O(n log n + m + n) = O(n log n)** where `n` is the length of `arr1` and `m` is the length of `arr2`.

	- `O(n log n)` from sorting `arr1`.
	- `O(n)` from populating the `HashMap`.
	- `O(m + n)` from processing `arr2` and handling the `HashMap`.

	The most significant term is `O(n log n)`, so the total time complexity is **O(n log n)**.
	*/
}
