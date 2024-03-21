package controlstment;

public class Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age=19,weight=56;
if(age>18)
{
	if(weight>=50)
	{
		System.out.println("eligible to donate blood");
	}
	else
	{
		System.out.println("not eligible");
		
	}
}
else
{
	System.out.println("not eligible,age must be greater than 18");
}
	
	}

}
