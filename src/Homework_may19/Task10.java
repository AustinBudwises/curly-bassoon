package Homework_may19;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter a word");
		
		String word = sc.nextLine();
		
		if (word.endsWith("ly")){
			System.out.println("really???");
			
		}else {
			System.out.println("Never mind");
		}
		sc.close();
		
		
		
	}

}
