package opps;

public class Reverse {

	public static void main(String[] args) {
		String str="testing training centre";
		String reversestr="";
		char ch;
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			reversestr=ch+reversestr;
			
		}
		System.out.println("reversed string is:"+reversestr);
			

	}

}
