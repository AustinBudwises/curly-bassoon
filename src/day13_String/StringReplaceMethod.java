package day13_String;

public class StringReplaceMethod {

	public static void main(String[] args) {
		
			String word= "car";
						word=word.replace("r","dillac");
						System.out.println(word);
			
			String str="tomato";
			System.out.println(str);
			str =str.replace('t','p');
			System.out.println(str);
			
			String str2="tamato";
			str2 = str2.replace("ta", "booty");
			System.out.println(str2);
			
			
			String str3= "How Turkey spoiled NATO's historic moment with Finland,Sweden";
			str3=str3.replace("Turkey", "India");
			
			System.out.println(str3);
			
			
			str3= str3.replace(" ", "");
			System.out.println(str3);
		
		
		
		
		

	}

}
