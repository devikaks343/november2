package opps;
interface tvremote
{
	public void tvvolume();
	
}
interface tvvolumedown
{
	public void tvremotedetails();
	
}
class  tv implements tvremote,tvvolumedown
{

	
@Override
public void tvremotedetails() {
	System.out.println("tvvolumedown");
	
}


@Override
public void tvvolume() {
	System.out.println("tvremotedetails");
	
}
}
class smarttv implements tvremote
{

	@Override
	public void tvvolume() {
		System.out.println("smarttvvolumeup");
		
	}
	
}

public class Interfacepgm{
	public static void main(String[]args) {
		tvremote ob=new tv();
		ob.tvvolume();
		ob=new smarttv();
		ob.tvvolume();
		
		
				
	}
	
	
}



