package opps;

abstract class car
{
abstract public void speedlimit();
public void cardetails()
{
	System.out.println("car details");
}

}
class maruthi extends car
{

	

	@Override
	public void speedlimit() {
		System.out.println("maruthi speedlimit");
		
	}
	
}
class kia extends car
{

	@Override
	public void speedlimit() {
		System.out.println("kia speed limit");
		
		
	}

}

public class Abstrarctclass {
	
	public static void main(String[] args) {
		maruthi ob=new maruthi();
		ob.cardetails();
		ob.speedlimit();
		kia obj=new kia();
		ob.cardetails();
		ob.speedlimit();
		
	}
}




	



	

