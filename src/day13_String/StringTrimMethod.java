package day13_String;

public class StringTrimMethod {

	public static void main(String[] args) {
			
		String str1= "                              Hello                  ";
		str1=str1.trim();
		
			System.out.println(str1.length());
		
			System.out.println(str1);
		
		String str2= "                        Big Booooooooooooooooooooooootyyyyyyyyyyyyyyy";
		str2=str2.trim();
		System.out.println(str2.length());
		System.out.println(str2);
	}

}
