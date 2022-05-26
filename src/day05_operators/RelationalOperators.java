package day05_operators;

public class RelationalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =1;
		int b =2;
		int c =3;
		
		System.out.println(a>b); //false
		System.out.println(a<b); //true
		
		boolean result = a<b; //true
		System.out.println(result);
		
		//compare 2 values
		
		result = a==b; //false
		System.out.println(result);
		
		System.out.println(a !=b); //mean A not equal to B
		
		result = a+b ==c; //true "this one mean a+b  equal to C"
		
		System.out.println(result);
		
		result = a+b !=c;  //false --a+b actually equal to c ( 1+2) =3
		System.out.println(result);
		
		System.out.println(a*b >=c);  //false 1*2 greater or equal to 3
		
		
		
		
		

;

		
		
		
	}

}
