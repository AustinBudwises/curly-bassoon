package day05_operators;

public class TernaryOperator {

	public static void main(String[] args) {
		
		//systax:
		
	//	variable = (condition)? trueblock : fasleBlock;
		
		int a,b;
		a =10;
		b =(a==1)? 5: 60;
		
		System.out.println(b);
		
		b = (a/10 ==1)? 10:20;
		System.out.println(b);
		System.out.println("Value of b is"+"  "+b);

		String result = (b%2 ==1)? "even number" : "odd number"; /*/becos it's false the result 
		go to the second block, if true the result go to the first block*/ 
		
		System.out.println(result);
		
		
	}

}
