package task_nishanthini_mam;

import java.util.ArrayList;
import java.util.List;

public class UseCustomer {
	public static void main(String[] args) {
		Customer cust1=new Customer("Ravi",1001,"male","Soap",10,555);
		Customer cust2=new Customer("Dev",1003,"female","Honey",50,485);
		Customer cust3=new Customer("Raj",1015,"male","pen",5,990);
		Customer cust4=new Customer("Ramya",1008,"female","Marker",15,885);
		
		List<Customer> customers=new ArrayList<>();
		customers.add(cust1);
		customers.add(cust2);
		customers.add(cust3);
		customers.add(cust4);
		
		cust1.firstLetter(customers);
		System.out.println(cust1.lastLetter(customers));
		System.out.println(cust1.secondMaxAmount(customers));
		System.out.println(cust1.thirdMaxAmountDetails(customers));
		cust2.maleCustomer(customers);
		System.out.println(cust1.minProductName(customers));
		
	}

}
