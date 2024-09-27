package com.notepad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterEmployeesBasedOnAge {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<Employee>(Arrays.asList(
			new Employee(1,"shiva",26),
			new Employee(2,"vishnu",27),
			new Employee(3,"hari",21),
			new Employee(2,"uma",21)));
		
		//filter Employee list based on age using streams?
		
		List<Employee> ageFiltered = list.stream().filter(e->e.getAge() > 23).toList();
		System.out.println(ageFiltered);
		
		//group employees based on age using streams?
		Map<Integer, List<Employee>> collect = list.stream().collect(Collectors.groupingBy(Employee::getAge));
		
		System.out.println(collect);
	}
}
