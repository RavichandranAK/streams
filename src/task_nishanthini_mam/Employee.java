package task_nishanthini_mam;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
	String name;
	int id;
	int salary;
	String designation;

	public Employee(String a, int b, int c, String d) {
		name = a;
		id = b;
		salary = c;
		designation = d;

	}

	public void setSalary(int a) {
		salary = a;
	}

	public int getSalary() {
		return salary;
	}

	public void setName(String a) {
		name = a;
	}

	public String getName() {
		return name;
	}

	public void setDes(String a) {
		designation = a;
	}

	public String getDes() {
		return designation;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", designation=" + designation + "]";
	}

	public int maxSalary(List<Employee> employee) {
		Employee res = employee.stream().max(Comparator.comparing(Employee::getSalary)).get();
		return res.getSalary();
	}

	public List<String> NameDetails(List<Employee> emp) {
		List<String> det = emp.stream().map(x -> x.getName()).collect(Collectors.toList());
		return det;
	}

	public List<String> DesDetails(List<Employee> emp) {
		List<String> det = emp.stream().map(x -> x.getDes()).collect(Collectors.toList());
		return det;
	}
	public void DesDetail(List<Employee> emp) {
		for(Employee x:emp) {
			System.out.println(x.getName()+"-"+x.getDes());
		}
		
	}

}