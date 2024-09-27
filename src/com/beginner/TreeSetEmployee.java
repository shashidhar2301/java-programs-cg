package com.beginner;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class TreeSetEmployee {

	public static void main(String[] args) {

		Set<Employee> set = new TreeSet<Employee>();

		set.add(new Employee(1, "shiva", 26));
		set.add(new Employee(2, "vishnu", 27));
		set.add(new Employee(3, "hari", 21));
		set.add(new Employee(2, "uma", 21));
		
		System.out.println(set);
	}
}
