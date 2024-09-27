package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortingArr {

	public static int[] sortArrBasedOnAnother(int[] arr1, int[] arr2) {

		
		Map<Integer, Integer> map = new HashMap<>();
		int[] result = new int[arr1.length];

		for (int i = 0; i < arr1.length; i++) {
			map.put(arr1[i], map.getOrDefault(arr1[i], 0) + 1);
		}
		System.out.println(map);

		List<Integer> list = new ArrayList<>();
		int count  = 0;
		for (int i = 0; i < arr2.length; i++) {
			if(map.containsKey(arr2[i])) {
				 count = map.get(arr2[i]);
				for(int j=0;j<count;j++) {
					list.add(arr2[i]);
				}
			}
			map.remove(arr2[i]);
		}
		
		
		
		for(Map.Entry<Integer, Integer> e  : map.entrySet()) {
			list.add(e.getKey());
		}
		System.out.println(list);
		return result;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(
				sortArrBasedOnAnother(new int[] { 2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19 }, new int[] { 2, 1, 4, 3, 9, 6 })));

	}

}

/*
 * ### Time Complexity:
- **Sorting `arr1`:** (O(m log m)), where (m) is the length of `arr1`.
- **Building frequency map:** (O(m)).
- **Building result list:** (O(n + m)), where (n) is the length of `arr2`.

The overall time complexity remains (O(m log m)) due to the sorting step.
*/
