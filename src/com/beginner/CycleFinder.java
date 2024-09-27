package com.beginner;



import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CycleFinder {

    public static int lengthOfCycle(int[] arr, int startInd) {
        Set<Integer> visited = new HashSet<>();
        int current = startInd;
        int step = 0;

        // Map to track the first occurrence of each index
        // Used to calculate the length of the cycle
        Map<Integer, Integer> indexMap = new HashMap<>();

        while (true) {
            if (current < 0 || current >= arr.length) {
                return -1; // Out of bounds
            }

            if (visited.contains(current)) {
                // Cycle detected, calculate the length
            	
                int cycleLength = step - indexMap.get(current);
                return cycleLength;
            }

            visited.add(current);
            indexMap.put(current, step);
           // System.out.println(indexMap);
            current = arr[current];
            step++;
        }
    }

    public static void main(String[] args) {
     //   System.out.println(lengthOfCycle(new int[]{1, 0}, 0)); // 2
     //   System.out.println(lengthOfCycle(new int[]{1, 2, 0}, 0)); // 3
        System.out.println(lengthOfCycle(new int[]{1, 2, 3, 1}, 1)); // 3
     //   System.out.println(lengthOfCycle(new int[]{1, 2, 3}, 0)); // -1
    }
}
