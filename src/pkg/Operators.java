package pkg;

public class Operators {

	public static void main(String[] args) {
		// Arithemetic operator
		System.out.println("---Arithemetic operator---");
		int a=20,b=10;
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));//quotient
		System.out.println("a%b="+a%b);//remainder
		
		//Assignment operators
		System.out.println("----Assignment operator---");
		int c;
		System.out.println(c=a);
		System.out.println(a+=b);//a=a+b; 20+10
		System.out.println(a-=b);//a=a-b; 30-10=20
		
		//realational operators
		System.out.println("----realationaloperators---");
		int v1=40,v2=20;
		System.out.println(v1>v2);
		System.out.println(v1==v2);
		
		
		//Logical operators
		System.out.println("-----logicaloperators----");
		String username="abc";
		String password="abc123";
		System.out.println(username=="abc" && password=="abc123");
		System.out.println(username=="ab"|| password=="abc123");
		System.out.println(!(username=="abc"));
		
		System.out.println("----unary operator---");
		//++ increment operator increment by one
		//decrement operator decrement by one
		
	int v3=10;
		System.out.println(v3++);//10
		System.out.println(v3);//11
		System.out.println(++v3);//12
		
		System.out.println("-----ternary operator----");
		//variable=condition?exp1:exp2;
		String s=v1>v2?"v1 is greater":"v2 is greater";
		System.out.println(s);		
		

	}

}
