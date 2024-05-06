package task_nishanthini_mam;

import java.util.ArrayList;
import java.util.List;


public class UseEmployee {
	public static void main(String[] args) {
		Employee emp1=new Employee("Ravi",1001,30000,"Manager");
		Employee emp2=new Employee("Ramya",1002,25000,"Staff");
		Employee emp3=new Employee("Dev",1004,40000,"Assistant");
		
		List<Employee> employees=new ArrayList<>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		
		System.out.println(emp1.maxSalary(employees));
		System.out.println(emp1.NameDetails(employees));
		System.out.println(emp1.DesDetails(employees));
		emp1.DesDetail(employees);
	}

}
