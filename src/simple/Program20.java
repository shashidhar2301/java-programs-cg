package simple;

import java.util.HashMap;
import java.util.Map;

public class Program20 {

	public static void main(String[] args) {
		/*
		 * 20. Given an array, print all the elements whose frequency is one, that is
		 * they do not have duplicates. Example: Array = [-1, -2, 3, 3, -2] Output = -1
		 * 
		 */
		
		System.out.println(frequencyCheck(new int[] {-1, -2, 3, 3, -1, -2}));
	}

	private static int frequencyCheck(int[] arr) {
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i : arr) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		
		for(int i :arr) {
			if(map.get(i)==1)
				return i;
		}
		return 0;
		
	}
}
