package Homework_may14;

import java.util.Scanner;

public class Coffee {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("How many cups of coffee you need");
		
		int cup = sc.nextInt();
		System.out.println("For Coffee"+cup+" cups you will need");
		
		int water = cup*200;
		System.out.println("1. Water "+water+" ml");
		
		int milk = cup*50;
		System.out.println("2. Milk "+milk+" ml");
		
		int coffeeBean = cup*15;
		System.out.println("3. Coffee Bean "+ coffeeBean+" g");
		
		sc.close();
		
		
	}

}
