package com.beginner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class AnagramGroup {

	public static void main(String[] args) {
		
		//Given an array, print all the elements whose frequency is one, 
		//that is they do not have duplicates. Example: Array = [-1, -2, 3, 3, -2] Output = -1
		
		/*
		 * int[] arr = {-1, -2, 3, 3, -2};
		 * 
		 * HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		 * 
		 * for(int i=0;i<arr.length;i++) {
		 * 
		 * if(hm.containsKey(arr[i])) hm.put(arr[i], hm.get(arr[i])+1); else
		 * hm.put(arr[i], 1); } //System.out.println(hm);
		 * 
		 * for(Entry e: hm.entrySet()) { if(e.getValue().equals(1))
		 * System.out.println(e.getKey()); }
		 */
		
		//List of ""cat"",""dog"", ""god""
		
		List<String> list = Arrays.asList("cat","dog","god","act","bat","cat");
		HashMap<String, Set<String>> map = new HashMap<String, Set<String>>();
		for(String str : list) {
			//for(int i=0;i<list.size();i++) {
			//int length = str.length();
			
			char[] chars = str.toCharArray();
	        Arrays.sort(chars);
	        
			if(map.containsKey(Arrays.toString(chars))) {
				
				
		        
				Set<String> list2 = map.get(Arrays.toString(chars));//.add(list.get(i));
				list2.add(str);
				map.put(Arrays.toString(chars), list2);
			}
			else {
				Set<String> li = new HashSet<String>();
				 li.add(str);
				 map.put(Arrays.toString(chars), li);
			}
				
				
		}
			System.out.println(map);
		 
			for(Entry e : map.entrySet()) {
				System.out.println(e.getValue());
			}
		
	}
}
