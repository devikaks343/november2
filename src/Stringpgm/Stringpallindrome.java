package Stringpgm;

public class Stringpallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="malayalam";
		String rev="";
		for (int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
			
		}
		System.out.println("reverse="+rev);
		if (rev.equals(s))
		{
			System.out.println("palliandrome");
			
		}else
		{
			System.out.println("not paliandrome");
		}
		

	}

}
