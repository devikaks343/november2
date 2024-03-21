package controlstment;

import java.util.Scanner;

public class Calculatorscanner {

	public static void main(String[] args) {
		Scanner in1=new Scanner(System.in);
		System.out.println("Enter two values");
		int a=in1.nextInt();
		int b=in1.nextInt();
		int c=a+b;
		System.out.println("sum-"+c);
		System.out.println("Enter two values");
		int d=in1.nextInt();
		int e=in1.nextInt();
		int f=d-e;
		System.out.println("sub-"+f);
		System.out.println("Enter two values");
		int g=in1.nextInt();
		int h=in1.nextInt();
		int i=g/h;
		System.out.println("div/"+i);
		

		}

}
//self program
