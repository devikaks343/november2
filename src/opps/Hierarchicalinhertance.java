package opps;

class animal1
{
	public void animalmethod()
	{
		System.out.println("animal details");
	}
}
class lion extends animal1
{
	public void lionmethod()
	{
		System.out.println("lion details");
		
	}
}
class tiger extends animal1
{
	public void tigermethod()
	{
		System.out.println("tiger details");
		
	}
}

public class Hierarchicalinhertance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lion ob=new lion();
		ob.lionmethod();
		ob.animalmethod();
		
		tiger obj=new tiger();
		obj.tigermethod();
		obj.animalmethod();
		

		
		
		
		
		
		
		

	}

}
