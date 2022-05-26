package Homework_may19;

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter 2 words:");
		
		String word1 = sc.nextLine();
		String word2 = sc.nextLine();
		
		word1 = word1.substring(1, word1.length());
		word2 = word2.substring(1, word2.length());
		
		System.out.println(word1+word2);
		
		
		
	}}

