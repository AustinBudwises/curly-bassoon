package Homework_may14;

import java.util.Scanner;

public class PowerOfNumber {
	public static void main(String[] args) {
		
		
				Scanner scan = new Scanner(System.in);
				
				System.out.println("Please Enter 2 Numbers:");
				int num1 = scan.nextInt();
				int num2 = scan.nextInt();
				 
				int result = 1;
				
				for(int i = 1; i <= num2; i++) {
				 
				result *= num1;
				 		
				}
				System.out.println("Number " + num1 + " raised to the power of " + num2 + " is: " + result);	
				
				scan.close();

}
}
