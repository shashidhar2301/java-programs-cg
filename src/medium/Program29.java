package medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Program29 {

	public static void main(String[] args) {
		/*
		 * "29. Given an integer array of size n. Elements of the array is >= 0.
		 * Starting from arr[startInd], follow each element to the index it points to.
		 * Find a cycle and return its length. No cycle is found -> -1.
		 * lengthOfCycle([1, 0], 0); // 2 lengthOfCycle([1, 2, 0], 0); // 3
		 * lengthOfCycle([1, 2, 3, 1], 0); // 3"
		 * 
		 */
		
		int length = lengthOfCycle(new int[] {1, 2, 2}, 0);
		System.out.println(length);
	}

	private static int lengthOfCycle(int[] arr, int index) {
		
		
		
		Set<Integer> visited = new HashSet<>();
		Map<Integer,Integer> map = new HashMap<>();
		int step = 0;
		while(true) {
			
			if(index >= arr.length) {
				return -1;
			}
			if(visited.contains(index)) {
				int length = step - map.get(index);
				return length;
			}
			
			visited.add(index);
			map.put(index, step);
			index = arr[index];
			step++;
			
		}
	}
}
