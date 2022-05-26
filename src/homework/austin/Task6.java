package homework.austin;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		/* Create a calculator that can calculate basic operators 
		like addition, subtraction, multiplication and division
        */
		
		Scanner calc = new Scanner(System.in);
		System.out.println("please input a:");
		double a = calc.nextDouble();
		System.out.println("please input b:");
		double b = calc.nextDouble();
		double sum = a+b; System.out.println("sum = "+sum);
		double sub = a-b; System.out.println("sub = "+sub);
		double mult = a*b; System.out.println("mult = "+mult);
		double div = a/b; System.out.println("div = "+div);
		double mod = a%b; System.out.println("module = "+mod);
		calc.close();

	}

}
