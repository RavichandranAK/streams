package preparation;

public class Employee {
	  private static Employee emp;
	  
	  
	  private Employee(){

		}

	public static Employee getEmp(){
	  if(emp==null){
	    return emp=new Employee();
	  }
	  else{
	    return emp;
	  }

	}

	public static void main(String args[]) {
	  Employee e1=Employee.getEmp();
	  System.out.println(e1.hashCode());
	
	  Employee e2=Employee.getEmp();
	  System.out.println(e2.hashCode());
	  
	  Employee e3=Employee.getEmp();
	  System.out.println(e3.hashCode());

	}

	}
