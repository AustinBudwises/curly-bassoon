package homework.austin;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		/*  Write a Java Program to print the following message. 
        
		Good Morning  
		5< 12 
		Good Afternoon
		12 - 17
		Good Evening
		17 - 24
	*/
	Scanner time = new Scanner(System.in);
	System.out.println("What time is it?");
	int t = time.nextInt();
	if (t>=5 && t<12) System.out.println("Good Morning");
	if (t>=12 && t<17) System.out.println("Good Afternoon");
	if (t>=17 && t<=24) System.out.println("Good evening");
time.close();
	

	}

}
