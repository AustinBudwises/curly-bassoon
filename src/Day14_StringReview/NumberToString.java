package Day14_StringReview;

public class NumberToString {

	public static void main(String[] args) {
				
		int a =1000;
		int b =1000;
		
		System.out.println(a+b);
		
		String valueA="";
		String valueB="";
		
		System.out.println(valueA.length());
		
		System.out.println(valueB.length());
		
		valueA =valueA+a;
		System.out.println(valueA.length());
		System.out.println(valueA.charAt(0));
		System.out.println(valueA.charAt(1));
		System.out.println(valueA.charAt(2));
		System.out.println(valueA.charAt(3));
		
		valueB+=b;
		System.out.println(valueB);
		System.out.println(valueA+valueB);
		
		
		
	}

}
