package java8Programs.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();
		empList.stream().sorted(Comparator.comparing(Employee::getSalary, Comparator.reverseOrder())).forEach(e->System.out.println(e));
		
		List<String> names = empList.stream().map(e->e.getName()).toList();
		System.out.println(names);
		
		String str = "capgemini";
		
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		
		//findByIdAndName(long id,string name);
	}

}
