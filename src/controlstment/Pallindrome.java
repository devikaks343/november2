package controlstment;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=111;
		int temp=n;
		int rem,rev=0;
		while (n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println(rev);
		if(temp==rev)
		{
			System.out.println("paliandrome");
		}
		else
		{
			System.out.println("not paliandrome");
		}
	}

}
