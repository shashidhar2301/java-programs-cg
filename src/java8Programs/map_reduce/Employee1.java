package java8Programs.map_reduce;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Employee1 {
    private int id;
    private String name;
    private String grade;
    private double salary;

    public Employee1() {
    }

    public Employee1(int id, String name, String grade, double salary) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee1 employee1 = (Employee1) o;
        return id == employee1.id && Double.compare(salary, employee1.salary) == 0 && Objects.equals(name, employee1.name) && Objects.equals(grade, employee1.grade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, grade, salary);
    }

    public static void main(String[] args) {
        Employee1 emp1 = new Employee1(1, "ravi", "A", 1234L);
        Employee1 emp2 = emp1;
        Employee1 emp3 = new Employee1(1, "ravi", "A", 1234L);

        System.out.println(emp1.equals(emp2));
        System.out.println(emp1 == emp3);

        Set<Employee1> s1 = new HashSet<>();
        s1.add(new Employee1(101,"teja","A",1234L));
        Set<Employee1> s2 = new HashSet<>();
        s2.add(new Employee1(101,"teja","A",1234L));

        System.out.println(s1.equals(s2));
    }
}
