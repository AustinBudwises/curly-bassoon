package day06_controlFlow;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args){
		/*
         *  Grade score    GPA
            A+     97–100 4.0
            A     93–96    3.9
            A−     90–92    3.7
            B+     87–89    3.3
            B     83–86    3.0
            B−     80–82    2.7
            C+     77–79    2.3
            C     73–76    2.0`
            C−     70–72    1.7
            D+     67–69    1.3
            D     63–66    1.0
            D−     60–62    0.7
            F     0–59    0.0
       */
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your score");
		
		
		int score = scan.nextInt();
	
		String grade = "";
		double gpa = 0;
	
		if (score>=0 && score <=100) {
		
		if (score >=97 && score <= 100)	{
			grade = "A+";
			gpa = 4.0;
			
		} 
		if (score >=93 && score <= 96)	
			{
				grade = "A";
				gpa = 3.9;
			}
		if (score >=90 && score <= 92) {	
			grade = "A-";
			gpa = 3.7;
		}
		if (score >=87 && score <= 89)	{
				grade = "B+";
				gpa = 3.3;
		}
				if (score >=83 && score <= 86)	{
					grade = "B";
					gpa = 3.0;
				}
				if (score >=80 && score <= 82)	{
					grade = "B-";
					gpa = 2.7;
				}
				if (score >=77 && score <= 79)	{
					grade = "C+";
					gpa = 2.3;
				}
				if (score >=73 && score <= 76)	{
					grade = "C";
					gpa = 2.0;
				}
				if (score >=70 && score <= 72)	{
					grade = "C-";
					gpa = 1.7;
				}
				if (score >=67 && score <= 69)	{
					grade = "D+";
					gpa = 1.3;
				}
				if (score >=63 && score <= 66)	{
					grade = "D";
					gpa = 1.0;
				}
				if (score >=60 && score <= 62)	{
					grade = "D-";
					gpa = 0.7;
				}
				if (score >=0 && score <= 59)	{
					grade = "F";
					gpa = 0.0;
				}
				
				
				
	} else { 
		System.out.println("Invalid score");
	}
        System.out.println("Grade" +" "+grade);
        System.out.println("GPA" +" "+gpa);
}
}


