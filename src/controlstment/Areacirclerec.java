package controlstment;

public class Areacirclerec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Areacirclerec sc= new Areacirclerec();
		sc.circle();
		sc.rectangle(20,12);
		double area=sc.triangle();
		System.out.println("area of triangle ="+area);
		int scarea=sc.square(5);
		System.out.println("area of square ="+scarea);
	}
	public void circle()
	{
		double area;
		int r=4;
		area=3.14*r*r;
		System.out.println("area of circle ="+area);
	}
	public void rectangle(int a,int b)
	{
		int area=1*b;
		System.out.println("area of rectangle="+area);
	}
	public double triangle()
	{
		int b=25;
		int h=15;
		double area=0.5*b*h;
		return area;
	}
	public int square(int a)
	{
		int area=a*a;
		return area;

	}

}
