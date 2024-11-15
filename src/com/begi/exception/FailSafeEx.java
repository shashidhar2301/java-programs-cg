package com.begi.exception;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Iterator;

//Java code to illustrate
//Fail Safe Iterator in Java
public class FailSafeEx {
	public static void main(String args[]) {
		
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>(new Integer[] { 1, 3, 5, 8 });
		
		Iterator itr = list.iterator();
		
		while (itr.hasNext()) {
			Integer no = (Integer) itr.next();
			
			System.out.println(no);
			if (no == 8)

				// This will not print,
				// hence it has created separate copy
				list.add(14);
		}
		System.out.println(list);
	}
}
//Fail-safe iterators allow modifications of a collection while iterating over it.
//These iterators don’t throw any Exception if a collection is modified while iterating over it.
//They use copy of original collection to traverse over the elements of the collection.
//These iterators require extra memory for cloning of collection. Ex : ConcurrentHashMap, CopyOnWriteArrayList