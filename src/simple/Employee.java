package simple;


public class Employee  implements Comparable<Employee>{
	
	private int id;
	private String name;
	private int age;
	
	public Employee(int id, String name, int age)
	{
		this.id = id;
		this.name = name;
		this.age=age;
	}

	@Override
	public int compareTo(Employee e1) {
		
		if(this.id == e1.id)
			return this.age - e1.age;
		
		return this.id-e1.id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
