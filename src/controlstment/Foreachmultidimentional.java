package controlstment;

import java.util.Scanner;

public class Foreachmultidimentional {

	public static void main(String[] args) {
		int[][]ar=new int  [3][4];
		System.out.println("Enter number");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=3;j++)
			{
				ar[i][j]=sc.nextInt();
			}
		}
		
			for (int a[]:ar)
			{
				for(int b:a)
					
				{
					
				
				System.out.print(b+" ");
				
		}
		System.out.println();
		

			}
	}
}





