package Stringpgm;

import java.util.Scanner;

public class Vowelpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a String");
		Scanner sc=new Scanner (System.in);
		String s=sc.next();
		Vowelpgm ob=new Vowelpgm();
		ob.Vowelpgm(s);
		
		
	
	}
	public void Vowelpgm(String s)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
			{
				count++;
				
			}
		
		
	}
		System.out.println("count"+count);
		
	}
		
		
		
		

		

		
	
	
	
	
	{
		
	}
	
	

}
