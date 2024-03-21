package opps;

public class Employee {
	String empname;
	int empid;
	
		
	public Employee(String Empname,int Empid)
	{
		this.empname=empname;
		this.empid=empid;
	}
	public void display()
	{
		System.out.println("empname="+empname);
		System.out.println("empid="+empid);
	}
	
		
				
				
				
				
				
	
	

	public static void main(String[] args) {
		Employee emp1=new Employee("afna",11);
				emp1.display();
	}
	
		

	}


