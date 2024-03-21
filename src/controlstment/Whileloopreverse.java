package controlstment;

public class Whileloopreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4567;
		int rem,rev=0;
		while (n>0)
		{
			rem=n%10;  //4567%10=7   //456%10=6   //45%5=5   //4%10=4
			rev=rev*10+rem;  //0+7    //70+6=76    //760+5=765    //7654
			n=n/10; //4567/10=456   //45    //4//0
			
		}
		System.out.println(rev);
		

	}

}
