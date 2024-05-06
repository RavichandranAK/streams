package task_nishanthini_mam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Customer {
	String name;
	int id;
	String gender;
	String productName;
	int productPrice;
	int availAmount; 
	
	public Customer(String a,int b,String c,String d,int e,int f) {
		name=a;id=b;gender=c;productName=d;productPrice=e;availAmount=f;
	}
	public String toString() {
		return name+" "+id+" "+gender+" "+productName+" "+productPrice+" "+availAmount;
	}
	public void setName(String a) {
		name=a;
	}
	public String getName() {
		return name;
	}
	public void setGender(String a) {
		gender=a;
	}
	public String getGender() {
		return gender;
	}
	public void setPname(String a) {
		productName=a;
	}
	public String getPname() {
		return productName;
	}
	public void setPprice(int a) {
		productPrice=a;
	}
	public int getPprice() {
		return productPrice;
	}
	public void setAamount(int a) {
		availAmount=a;
	}
	public int getAamount() {
		return availAmount;
	}
	
	public void firstLetter(List<Customer> c) {
		c.forEach(x->System.out.println(x.getName().charAt(0)));
	}
	public List<Character> lastLetter(List<Customer> customer) {
		List<Character> last=new ArrayList<>();
		 for(int i=0;i<customer.size();i++) {
			 last.add(customer.get(i).getName().charAt(customer.get(i).getName().length()-1));
		 }
		 return last;
	}
	public int secondMaxAmount(List<Customer> customer) {
		  List<Customer> secMax=customer.stream().sorted(Comparator.comparing(Customer :: getAamount).reversed()).collect(Collectors.toList());
		  return secMax.get(1).getAamount();
	}
	public Customer thirdMaxAmountDetails(List<Customer> customer) {
		List<Customer> thirdMax=customer.stream().sorted(Comparator.comparing(Customer :: getAamount).reversed()).collect(Collectors.toList());
		return thirdMax.get(2);
	}
	public void maleCustomer(List<Customer> customer) {
		List<Customer> male=customer.stream().filter(x->x.getGender().equals("male")).collect(Collectors.toList());
		male.forEach(x->System.out.println(x.getName()+" "+x.getPname()+" "+x.getPprice()));	
	}
	public String minProductName(List<Customer> customer) {
		 Customer min=customer.get(0);
		     for(int i=0;i<customer.size();i++) {
		    	 if(customer.get(i).getPname().length()<min.getPname().length()) {
		    		 min=customer.get(i);
		    	 }
		     }
		     return min.getPname()+"-"+min.getPprice();
	}

}
