package day13_String;

public class StringSubStringMethod {

	public static void main(String[] args) {
			
		String str1 ="BigBoooty";
		System.out.println(str1.substring(4));
		
		System.out.println(str1.substring(0, 3));
		
		String str2= "Ey Mannnnnn";
		System.out.println(str2.substring(3));
		
		
		String email= "firstname.LastName@domainName.com";
		String gmail = "austin.budws@gmail.com";
		System.out.println(gmail.lastIndexOf('g'));
		
		String domainName=gmail.substring(13,18);
		System.out.println(domainName);
		
		
		System.out.println(gmail.substring(gmail.indexOf('g'),gmail.lastIndexOf(".")));
		

	}

}
