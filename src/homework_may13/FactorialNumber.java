package homework_may13;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
	
		Scanner factorial = new Scanner(System.in);
		System.out.println("Enter Number");
		
		long input = factorial.nextLong();
		factorial.close();
		int fact =1; 
		for(int i=1;i<=input;i++)
			fact = fact*i ;
			{
		System.out.println(fact);
			}
			
	}
	}

	
		    
	


