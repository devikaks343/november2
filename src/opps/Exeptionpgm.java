package opps;

public class Exeptionpgm {

	public static void main(String[] args) {
		
		try {
			int a=40, b=0;
			double c=a/b;
			System.out.println(c);
			
		}
		catch(Exception e)
		{
			System.out.println("arithemetic exeption");
			System.out.println(e.getMessage());
			
		}
		System.out.println("hello");
		try {
			String s=null;
			System.out.println(s.length());
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
			System.out.println("nullpointerexception");
			
			
			
		}
		System.out.println("String length");
		}

	}


