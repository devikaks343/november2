package opps;

class father
{
	public void job()
	{
		System.out.println("engineer");
	}
}
class son extends father
{
    @Override
	public void job()
	{
		System.out.println("doctor");
		super.job();
		
	}
}
public class Methodoverride {

	public static void main(String[] args) {
	son ob= new son();
	ob.job();

	}

}
