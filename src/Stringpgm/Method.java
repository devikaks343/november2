package Stringpgm;

public class Method {

	public static void main(String[] args) {
    Method ob=new Method();
    ob.add();
    int s=ob.sub();
    System.out.println("subans="+s);
    System.out.println(ob.mul(5,4));
    ob.div(40,10);

    

    

    
	}
	//1.method without return type and without parameter
	public void add()
	{
		int a=20,b=30,c;
		c=a+b;
		System.out.println(c);
		
	}
	//method with returntype and without parameter
	public int sub()

	{
		int a=20,b=10,c;
		c=a-b;
		return c;
		
	}
	//method with without returntype and with  parameter
	public int  mul(int a,int b)

	{
		int m=a*b;
		return m;
		
		
		
	}
	//method with returntype with parameter
	public  void div(int a ,int b)
	{
		double c=a/b;
		System.out.println(c);
		
	
		
	}
	
	
	
	
	
	
	
	
	

}

