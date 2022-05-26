package Homework_may14;

import java.util.Scanner;

public class Max1020 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter two numbers:");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		if(num1 < 10 && num2 < 10){
			System.out.println(0);
			
		}else if(num1 <= 20 && num2 <= 20) {
			if (num1 > num2) {
				System.out.println("Max number is: " + num1);
			}else {
				System.out.println("Max number is: " + num2);

		
			scan.close();
		}
	}
	
	}
}
	


