package com.notepad;

public class Employee {
	
	private int empid;
	private String name;
	private int age;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", age=" + age + "]";
	}
	public Employee(int empid, String name, int age) {
		super();
		this.empid = empid;
		this.name = name;
		this.age = age;
	}
	
	

}
