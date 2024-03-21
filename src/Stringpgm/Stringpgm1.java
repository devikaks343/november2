package Stringpgm;

public class Stringpgm1 {

	public static void main(String[] args) {
		String s="hello";
		String s1="welcome";
		String s2="Hello";	
		String s3="hello welcome to luminar";
;
		//concat
		System.out.println(s.concat(s1));
		System.out.println(1+3+s+5+6);
		
		//equals
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));
		System.out.println(s.equalsIgnoreCase(s2));
		//starts with
		System.out.println(s3.startsWith("hello"));
		System.out.println(s3.endsWith("luminar"));
		
		//trim
		System.out.println(s3.trim());
		
		//contains
		System.out.println(s3.contains("welcome"));
		
		//length
		System.out.println(s2.length());
		
		

		//character
		System.out.println(s2.charAt(0));
		
		//uppercase to lowercase
		System.out.println(s2.toUpperCase());
		System.out.println(s3.toLowerCase());
		
		//substring
		System.out.println(s1.substring(1,3));
		
		//split
		String[] st=s3.split(" ");
		for(String str:st)
		{
			System.out.println(str);
		}
		
		
		//replace
		System.out.println(s3.replace("hello"," hi"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
