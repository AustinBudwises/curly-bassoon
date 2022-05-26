package homework.austin;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		// Eligible for vote (true/false)
				Scanner myObj = new Scanner(System.in);
				System.out.println("Please input your age : ");
				
				int a = myObj.nextInt();
				
		        
				System.out.println("This person is eligible to vote for Donald trump or Joe Biden?");
				
				boolean eligibility = (a>=18);
				System.out.println(eligibility);
				
				myObj.close();


	}

}
