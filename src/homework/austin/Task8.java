package homework.austin;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		// odd or even number
				Scanner myObj = new Scanner(System.in);
				System.out.println("input number: ");
				
				int a = myObj.nextInt();
				
				if (a%2==0) {System.out.println(a + " is even.");}
				
				else {System.out.println(a + " is odd.");}
				
				myObj.close();
				
				

	}

}
