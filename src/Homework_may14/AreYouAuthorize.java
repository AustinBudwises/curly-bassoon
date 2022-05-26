package Homework_may14;

import java.util.Scanner;

public class AreYouAuthorize {

	public static void main(String[] args) {
		
		String name = "", role ="";
		int level = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your full name:");
		name = scan.nextLine();
		
		System.out.println("What is your clearance level ?");
		level = scan.nextInt();
		
		if (level == 1) {
		role = "junior employee";
		} else if (level == 2) {
		role = "senior employee";
		} else if (level == 3) {
		role = "manager";
		} else if (level == 4) {
		role = "admin";
		}
		if (level >= 3) {

		System.out.println(name + ", you are " + role + "Welcome to the program ABC");
		} else {
		System.out.println("Sorry, " + name + "The " + role + " don'thave access to this program");

		}
		scan.close();

	}

}
