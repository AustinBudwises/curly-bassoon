package day13_String;

public class StringFind {

	public static void main(String[] args) {

		String name = "President George Washington";
		
		name.indexOf('P');
		name.indexOf('e');
		name.indexOf("George");
		name.indexOf('e',3);
		name.indexOf("Bob");		
		name.lastIndexOf('e');
	
		System.out.println(name.indexOf('P'));
		System.out.println(name.charAt(17));
		
		
		System.out.println(name.indexOf("rge"));
		System.out.println(name.indexOf("Bob"));
		
		System.out.println(name.indexOf("George")>-1);
		
		
		
	}

}
