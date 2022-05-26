package Homework_may19;

import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Email Address");
		String email = sc.nextLine();
		
		
		int UnderScore = email.indexOf( '_' ); 
		  
		if(UnderScore == -1)

		System.out.print("output: " + email);

		else {

		int indexAtRate = email.indexOf( '@' ); 
		String firstname = email.substring(0, UnderScore);   
		String lastname = email.substring(UnderScore+1, indexAtRate); 
		String remainEmail = email.substring(indexAtRate, email.length()); 
		  
		String newEmail = lastname + "_" + firstname + remainEmail;

		  
		System.out.print("output: " + newEmail);
		
		
		
		}	
	
	}

	}


