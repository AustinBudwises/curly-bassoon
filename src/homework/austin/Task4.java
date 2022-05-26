package homework.austin;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// Write a Java Program that prints the day of the week
				Scanner dayOftheWeek = new Scanner(System.in);
				System.out.println("Please input your day's number:");
				int n = dayOftheWeek.nextInt();
				if (n==1) System.out.println("Today is Monday");
				if (n==2) System.out.println("Today is Tuesday");
				if (n==3) System.out.println("Today is Wednesday");
				if (n==4) System.out.println("Today is Thursday");
				if (n==5) System.out.println("Today is Friday");
				if (n==6) System.out.println("Today is Saturday");
				if (n==7) System.out.println("Today is Sunday");
				dayOftheWeek.close();

		
		
		
		
	}
	
}
