package day05_operators;

import java.util.Scanner;

public class ScannerPractice {

	public static void main(String[] args) {
			
		Scanner austin = new Scanner(System.in);
		System.out.println("Please type value a");
		//int a =1;
		int a = austin.nextInt();
			
		System.out.println("Please type value b");
			//int b= 2;
			
		int b = austin.nextInt();
		System.out.println("Please type value c");
			//int c=3;
		int c = austin.nextInt();
			
		System.out.println(a+b>c);
		System.out.println();
		austin.close();
		
	}

}
