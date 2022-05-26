package day05_operators;

import java.util.Scanner;

public class ScannerObject {

	public static void main(String[] args) {
		// Create instance of scanner object
		
		Scanner s = new Scanner(System.in);
		
		/*System.out.println("Please Type Number A");
		
		int a =s.nextInt();
		
		System.out.println("Please Type Number B");
		int b =s.nextInt();
		
		int result = a+b;

		System.out.println(result);
		
		s.close();*/
		System.out.println("Ey Mannnnnn What's your name?");
		
		String name = s.nextLine();
		
		System.out.println("Heyyyyy" +" " + name+"  "+ "How are you?");
		
		s.close();
		
	}

}
