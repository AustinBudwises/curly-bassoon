package homework.austin;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Age");
		
        int age  = scan.nextInt();
        
        
		if (age  <=2) {
	            System.out.println("Infant");
	        }
	        
	        if (age <=4 && age > 2) {
	            System.out.println("Toddler");
	        }
	        
	        if (age <=7 && age >4) {
	            System.out.println("Early School Age");
	        }
	        
	        if (age <=12 && age >7) {
	            System.out.println("Middle School Age");
	        }
	        
	        if (age <=17 && age >12) {
	            System.out.println("Early Adolescence");
	        }
	        
	        if (age <=25 && age >17) {
	            System.out.println("Later Adolescence");
	        }
	        
	        if (age <=30 && age >25) {
	            System.out.println("Early Adulthood");
	        }
	        
	        if (age <=50 && age >30) {
	            System.out.println("Middle Adulthood");
	        }
	        
	        
	        
	        if (age > 50) {
	            System.out.println("Later Adulthood");
	        }
	        scan.close();	
		
		
		
		
		
		
	
		
		
	
		
		
		
		
		

	}

}
