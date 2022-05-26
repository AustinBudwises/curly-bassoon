package homework_may13;

import java.util.Scanner;

public class CampusTime {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Time (24hrs Format)");
		int time = scan.nextInt();
		
		
		if(time >= 8 && time <= 23) {
			System.out.println("Campus is Open");
		}else {
			System.out.println("Campus is Closed");
		}
		
		scan.close();

	}

}
