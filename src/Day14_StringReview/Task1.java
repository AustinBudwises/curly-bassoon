package Day14_StringReview;



public class Task1 {

	public static void main(String[] args) {
		/*
         * ## Task1
        `write a program that asks user to enter a sentence.
                        then print the first & last characters of the sentence
        Example:
            Input: Welcome To TechCircle
            output: We
        `*/
        
        
        String input = "Welcome To TechCircle";
        
        char firstChat = input.charAt(0);
//        char lastChar = input.charAt(21)
        
        char lastChar = input.charAt(input.length()-1);
        
        System.out.println(firstChat);
        System.out.println(lastChar);
		
		
	}

}
