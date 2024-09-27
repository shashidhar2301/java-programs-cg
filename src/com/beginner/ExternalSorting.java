package com.beginner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExternalSorting {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList( "Ajay", "Raja", "Keshav", "List", "Set", "Elephant", "Drone");
		
		String externalSort = "TESARDLK";
		char[] charArray = externalSort.toCharArray();
		List<String> sortedArr = new ArrayList<String>();
		
		for(int i=0;i<charArray.length;i++) {
			
			for(String s : list) {
				if(s.startsWith(Character.toString(charArray[i]))) {
					sortedArr.add(s);
				}
			}
			
		}
		
		//System.out.println(sortedArr);
		sortingByComparator();
		sortingByComparator1();
	}
	
	public static void sortingByComparator(){
		 List<String> list = Arrays.asList("Ajay", "Raja", "Keshav", "List", "Set", "Elephant", "Drone","Rani");
	        String externalSort = "TESARDLK";
	        
	        // Create a custom order map
	        Map<Character, Integer> orderMap = new HashMap<>();
	        for (int i = 0; i < externalSort.length(); i++) {
	            orderMap.put(externalSort.charAt(i), i);
	        }

	        // Define a custom comparator
	        Comparator<String> customComparator = (s1, s2) -> {
	            int minLength = Math.min(s1.length(), s2.length());
	            for (int i = 0; i < minLength; i++) {
	                char c1 = s1.charAt(i);
	                char c2 = s2.charAt(i);

	                // Get the order of the characters, if they exist in the order map
	                Integer order1 = orderMap.getOrDefault(c1, Integer.MAX_VALUE);
	                Integer order2 = orderMap.getOrDefault(c2, Integer.MAX_VALUE);

	                // Compare based on the order
	                if (!order1.equals(order2)) {
	                    return order1 - order2;
	                }
	            }
	            // If one string is a prefix of the other, the shorter one should come first
	            return s1.length() - s2.length();
	        };

	        // Sort the list using the custom comparator
	        List<String> sortedArr = new ArrayList<>(list);
	        Collections.sort(sortedArr, customComparator);

	        // Output the sorted list
	       System.out.println("Sorted Strings: " + sortedArr);
	    }
	
	public static void sortingByComparator1(){
		 List<String> list = Arrays.asList("Ajay", "Raja", "Keshav", "List", "Set", "Elephant", "Drone","Rani");
	        String externalSort = "TESARDLK";
	        
	        Map<Character,Integer> map = new HashMap<Character, Integer>();
	        for(int i=0;i<externalSort.length();i++) {
	        	map.put(externalSort.charAt(i), i);
	        }
	        
	        Comparator<String> custom =  (s1,s2)->{
	        	
	        	int lnegth = Math.min(s1.length(), s2.length());
	        	 // Get the rank from the map, if character not present assign a high rank
	               
	        	for(int i=0;i<lnegth;i++) {
	        		int index1 = map.getOrDefault(s1.charAt(i),Integer.MAX_VALUE);
	        		int index2 = map.getOrDefault(s2.charAt(i),Integer.MAX_VALUE);
	        		
	        		if(index1!=index2)
	        			return index1-index2;
	        		
	        	}
	        	// If one string is a prefix of another
	        	return s1.length() -s2.length();
	        };
	        
	        List<String> sorted = new ArrayList<String>(list);
	        Collections.sort(sorted,custom);
	        System.out.println(sorted);
	        
	}
	}
	
	
 