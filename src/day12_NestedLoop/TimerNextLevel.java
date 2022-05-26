package day12_NestedLoop;

import java.util.Scanner;

public class TimerNextLevel {

	public static void main(String[] args) throws InterruptedException {
			
		Scanner scan = new Scanner(System.in);
		System.out.println("How long wanted to wait for?");
		int waitTime = scan.nextInt();
		scan.close();
		System.out.println(waitTime+"timer start!");
		
		for(int i =waitTime-1 ;i>=0;i--) {
		
					for (int j =59;j>=0;j--) {
							System.out.println(i+":"+j);
							Thread.sleep(1000); //1000 is 1000 milliseconds=1 second
		
						}
		}
		
		System.err.println("Time's UP!!!");
	}

}
