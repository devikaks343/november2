package opps;
class Empdetails
{
	private String empname;
	private int empid;
	public String getempname() {
		return empname;
		
		
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
}

public class Encapsulationpgm {

	public static void main(String[] args) {
	Empdetails ob=new Empdetails();
	ob.setEmpid(1);
	ob.setEmpname("dhg");
	System.out.println("name="+ob.getempname());
	System.out.println("id="+ob.getEmpid()); 
	
	
	
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	}


