package day06_controlFlow;

public class OmittingElsePart {

	public static void main(String[] args) {
				int a =5;
				
				if(a%2==1) {
					
					System.out.println(a+"is odd number");
				}
				if (a%2==0) {
					System.out.println(a + "is even number");
				}
			
				System.out.println("line #16");
				
				int n1=300;
				int n2 =4;
				
				if (n1>n2) {
					System.out.println("Max number is"+n1);
					System.out.println("Min number is"+n2);
					
					
				}
				if (n1<n2) {
					System.out.println("max number is"+n2);
					System.out.println("Min numberis"+n1);
				}
				
				if (n1==n2) {
					System.out.println("they are equal");
				}
				
	}
	
	
	
	

}
