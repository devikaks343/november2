package opps;

public class Methodoverloading {
	

	public static void main(String[] args) {
		
		Methodoverloading ob =new Methodoverloading();
		ob.add(5.6, 6);
		ob.add(8, 4.6);
		ob.add(3, 8);

	}
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);  
		
	}
	public void add(int a, double b)
	{
		double c= a+b;
		System.out.println(c);
	}
	public void add(double a,int b)
	{
		double c=a+b;
		System.out.println(c);
	}
	

}

