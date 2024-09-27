package com.notepad;

import java.util.Arrays;
import java.util.List;

public class GreatestDataTypeObjects {

	public static void main(String[] args) {

		/*
		 * List<Object> mixedList = Arrays.asList(1, "Hello", 2.5f, 3, "World", 4.5f, 2,
		 * "Java", 3.14f); A list has mix of String, Integer and Float objects. How to
		 * find which data type has a greater number of objects in the list
		 * 
		 */
		
		List<Object> mixedList = Arrays.asList(1f, "Hello", 2.5f, 3, "World", "4.5f", 2, "Java", 3.14f);
		
		int integerCount=0, stringCount = 0, floatCount = 0;
		
		for(Object o : mixedList) {
			if(o instanceof String)
				stringCount++;
			else if(o instanceof Float)
				floatCount++;
			else if(o instanceof Integer)
				integerCount++;
			
		}
		if(integerCount > stringCount && integerCount > floatCount)
			System.out.println("Integer count is greater");
		else if(integerCount < stringCount && stringCount > floatCount)
			System.out.println("String count is greater");
		else
			System.out.println("Float count is greater");
	}

}
