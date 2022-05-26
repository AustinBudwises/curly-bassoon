package Homework_may19;

import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Email Address");
		String email = sc.nextLine();
		
		String firstName = email.substring(0,email.indexOf('_'));
	    String lastName = email.substring(email.indexOf('_')+1,email.indexOf('@'));
	    String domainName = email.substring(email.indexOf('@')+1,email.indexOf('.'));
	  
	    String upperFirstName = firstName.toUpperCase().substring(0,1)+firstName.toLowerCase().substring(1);
	    String upperLastName = lastName.toUpperCase().substring(0,1)+lastName.toLowerCase().substring(1);
	    
	    System.out.println("First Name :"+ upperFirstName);
	    System.out.println("Last Name :"+ upperLastName);
	    System.out.println("Domain Name :"+ domainName);
	 
	    sc.close();
	}
		
}
