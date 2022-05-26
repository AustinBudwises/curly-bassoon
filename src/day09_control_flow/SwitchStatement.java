package day09_control_flow;

public class SwitchStatement {

	public static void main(String[] args) {
		
		
		char grade = 'A';
		switch (grade) {
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		System.out.println("Pass");	
		break;
		case 'W' :
		System.out.println("Withdraw");
		case 'I':
		System.out.println("Incomplete");
		break;
		default:
		System.out.println("Fail");
		
			
		}
		
		
		

	}

}
