package test;

import java8Programs.example.Employee;

public class ComparingIntergerAndCustClass {
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee(10);
		Employee emp2 = new Employee(10);
		//System.out.println(emp1.equals(emp2));
		
		Integer i1 = new Integer(20);
		Integer i2 = new Integer(20);
		
		Integer i3 = 160;
		Integer i4 = 160;
		System.out.println(i3==i4);
		//System.out.println(i1==i2);
		
	}

}
