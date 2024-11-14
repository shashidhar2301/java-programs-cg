package com.begi.exception;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//Java code to illustrate
//Fail Fast Iterator in Java
public class FailFast {
	public static void main(String[] args) {
		Map<String, String> cityCode = new HashMap<String, String>();
		cityCode.put("Delhi", "India");
		cityCode.put("Moscow", "Russia");
		cityCode.put("New York", "USA");

		Iterator iterator = cityCode.keySet().iterator();

		while (iterator.hasNext()) {
			System.out.println(cityCode.get(iterator.next()));

			// adding an element to Map
			// exception will be thrown on next call
			// of next() method.
			cityCode.put("Istanbul", "Turkey");
		}
	}
}
//These iterators throw ConcurrentModificationException if a collection is modified while iterating over it.
//They use original collection to traverse over the elements of the collection.
//These iterators don’t require extra memory.
//Ex : Iterators returned by ArrayList, Vector, HashMap.

/*
To know whether the collection is structurally modified or not, fail-fast iterators use an internal flag called
modCount which is updated each time a collection is modified.Fail-fast iterators checks the modCount flag 
whenever it gets the next value (i.e. using next() method), and if it finds that the modCount
has been modified after this iterator has been created, it throws ConcurrentModificationException.
*/