package Homework_may19;

import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Your First Name : ");
		String str1 = sc.nextLine();
		
		System.out.println("Please Enter Your Last Name: ");
		String str2 = sc.nextLine();
		
		
	    String firstName = str1.toUpperCase().substring(0,1)+str1.toLowerCase().substring(1);
	    String lastName = str2.toUpperCase().substring(0,1)+str2.toLowerCase().substring(1);
	    
	    System.out.println("Your Name :"+firstName +" "+ lastName);
	 
	 
	    sc.close();

	}

}
