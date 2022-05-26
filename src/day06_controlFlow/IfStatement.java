package day06_controlFlow;

public class IfStatement {

	public static void main(String[] args) {
			//decision making statement
		// is statement And switch case
		// syntax :
		
		/*
		 * If (condition){
		 * 		statement1
		 * }else{
		 * 		statement2
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		int a =5;
		int b =7;
		
		if (a>b) {
			System.out.println(" a is a greater");
		}else {
			System.out.println("b is a greater");
			
		}
		
		int count =2;
		int total = 4;
		
		if (count <3)
		{
			total = 0;
		}else {
			total = total +count;
		
		}		
		
		System.out.println(total);
	}

}
