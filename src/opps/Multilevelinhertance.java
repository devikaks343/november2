package opps;

class animal

{
public void animalmethod()
{
	System.out.println("Animal details");
	
}
	
}
class dog extends animal
{
	public void dogmethod()
	{
		System.out.println("dog details");
		
	}
}
class babydog extends dog
{
	public void babydogmethod()
	{
		System.out.println("babydog details");
	}
}



public class Multilevelinhertance {

	public static void main(String[] args) {
	babydog ob=new babydog();
	ob.babydogmethod();
	ob.dogmethod();
	ob.animalmethod();

	
	}

}



