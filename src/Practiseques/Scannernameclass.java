package Practiseques;
import java.util.Scanner;

public class Scannernameclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner (System.in);
		System.out.println("what is your name?");
		String name=scanner.nextLine();
		System.out.println("how old are you");
		int age=scanner.nextInt();
		scanner.nextLine();
		System.out.println("which food do you like");
		String food=scanner.nextLine();
		
		System.out.println("hello" +name);
		System.out.println("you are"+age+"years old");
		System.out.println("you like "+food);
		
		
		
		
		

	}

}
