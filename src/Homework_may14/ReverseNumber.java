package Homework_may14;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a number:");
		
		int num = scan.nextInt();
		
		while (true) {
			System.out.print(num + " ");		 
			num--;
			if(num == 0) 
				break;		
		}
		
		scan.close();


	}

}
