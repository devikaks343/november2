package opps;

class member
{
	String name;
	int age;
	long phonenumber;
	
	public void printdetails()
	
	{
		System.out.println("name="+name);
		System.out.println("age="+age);
		System.out.println("phonenumber="+phonenumber);
		
	}
}
class employee2 extends member

{
	String specialization;
}
class manager extends member
{
	String department;
	
}







public class Inheritancecls {

	public static void main(String[] args) {
		employee2 ob=new employee2();
		ob.name="devika";
		
		
		ob.age=22;
		
		ob.phonenumber=2345678918L;
		ob.printdetails();
		System.out.println(ob.specialization="tester");
		
		manager obj=new manager();
		ob.age=23;
		ob.name="aparna";
		ob.phonenumber=19875432314L;
		ob.printdetails();
	
		
		
		
		
		
				
		

	}

}
