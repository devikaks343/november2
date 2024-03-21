package Stringpgm;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter size of array");
		n=s.nextInt();
		System.out.println("enter array element");
		int a[]=new int [n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
			
		}
		int b=a[0];
		for (int i=0;i<n;i++)
		{
			if(a[i]>1)
			{
				b=a[i];
				
			}
		}
		System.out.println("largest element in the array is :"+b);
		

		

	}

}
