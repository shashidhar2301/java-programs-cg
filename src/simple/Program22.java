package simple;

import java.util.Set;
import java.util.TreeSet;

public class Program22 {

	public static void main(String[] args) {

		/*
		 * 22. Create a custom class like Employee/Person with 2 to 3 fields and create
		 * the TreeSet and store two objects and display the size of treeset
		 * 
		 */
		Employee e1 = new Employee(1,"vishnu",29);
		Employee e2 = new Employee(2,"yash",32);
		Employee e3 = new Employee(3,"Neha",22);
		Employee e4 = new Employee(2,"uma",23);
		
		Set<Employee> set = new TreeSet<>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		
		System.out.println(set);
	}
}
