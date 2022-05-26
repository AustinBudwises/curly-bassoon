package day06_controlFlow;

public class EligibleToBuyAlcohol {

	public static void main(String[] args) {
		/*/  Ex:
        name = "James"
        age = 19
        output:
            James is eligible to buy alcohol?
                false
*/
				String name = "James"	;
				int age = 19;
				String message = name + " is eligible to buy alcohol?";
				
				boolean isEligible = age>=21;
				
				System.out.println(message);
				System.out.println(isEligible);
	
	}

}
