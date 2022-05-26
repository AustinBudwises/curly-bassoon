package day10_loopReview;

public class ValidTriangle {

	public static void main(String[] args) {
		/*
		 * A triangle is valid if the sum of all the three angles is equal to 180
		 * degrees. Write a program that declares three integers as angles and check
		 * whether a triangle is valid or not.
		 * 
		 */
		int a = 30;
		int b = 60;
		int c = 90;

		if (a + b + c == 180) {
			System.out.println("Triangle is Valid");
		} else {
			System.out.println("Triangle is Invalid");
		}

	}
}
