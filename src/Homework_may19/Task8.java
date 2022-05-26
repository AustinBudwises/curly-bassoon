package Homework_may19;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		/*## Task8
`
	write a program that asks the user enter a three letter word. Check if the middle
	character of the given word is 'a'. In the case it is print: "Cool word", but in the case
	the middle letter is not 'a' print: "Okay word".
     - If the user does not enter a 3 letter word tell them:
       If the word is less than 3 letters: "Word is too short"
       If the word is too long: "Word is too long"
`
*/
		Scanner sc =new Scanner(System.in);
		System.out.println("Please enter a Three Letters Word");
		
		String str = sc.nextLine();
        if(str.length()>3) {
        	System.out.println("Word is too long!");
        }else if (str.length() < 3) {
            System.out.println("Word is too short");
            }else {
            	{
        		if(str.charAt(1) == 'a') {
        			System.out.println("Cool Word");
        		}else {
        			System.out.println("Okay word");
        			}
        		}
	
         sc.close();
         
            
        }

	}

}
