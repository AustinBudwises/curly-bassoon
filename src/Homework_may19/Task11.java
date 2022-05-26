package Homework_may19;

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter a word");
		String str = sc.nextLine();
		
		if(str.startsWith("x")) {
		}
		String word =str.substring(1,str.length());
		{
			System.out.println(word);
			
		
		}
		sc.close();

	}

}
