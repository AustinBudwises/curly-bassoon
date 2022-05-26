package homework_may13;

import java.util.Scanner;

public class ReturnNumber {

	public static void main(String[] args) {
		 //`Write a program that asks the user to enter a number for 5 times.
	//	return the maximum number
		Scanner sc = new Scanner(System.in);
		int max = 0;
		for (int i = 1; i <= 5; i++) {
			
			System.out.printf("Please Enter your number %d ", i);
			int j = sc.nextInt();
			if (j > max) {
				max = j;
			}
		}
		System.out.println("Max number: " + max);

		sc.close();

	}
}


