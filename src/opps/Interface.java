package opps;
interface bike
{
	public void acceleration();
	
}
interface bikeaccessories 
{
	public void bikedetails();
}

	
class honda implements bike,bikeaccessories
{

	@Override
	public void acceleration() {
		System.out.println("honda acceleration");
	}

	@Override
	public void bikedetails() {
		System.out.println("bike details");
		
	}
		
		
	}
	class Ola implements bike
	{

		@Override
		public void acceleration() {
	System.out.println("Ola acceleration");
			
		}
		
	}


public class Interface {

	public static void main(String[] args) {
	bike ob=new honda();
	ob.acceleration();
	ob=new Ola();
	ob.acceleration();
	
	

	}

}
