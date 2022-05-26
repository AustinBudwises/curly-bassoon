package homework_may13;

public class SalaryWithProgessiveTax {

	public static void main(String[] args) {
		double salary = 130000;
		char married = 'Y';
		double taxRate = 0;
		double salaryAfterTax;
		
		if (salary >= 130000) {
			taxRate = 0.35;
			salaryAfterTax = salary-(salary * taxRate);

		} else if (salary>= 100000 && salary < 130000) {
			taxRate = 0.3;
			salaryAfterTax = salary- (salary* taxRate);

		} else if (salary >= 80000 && salary < 100000) {
			taxRate = 0.25;
			salaryAfterTax = salary - (salary * taxRate);

		} else {
			taxRate = 0.2;
			salaryAfterTax = salary - (salary * taxRate);
		}

		if (married == 'Y') {
			taxRate -= 0.05;
			salaryAfterTax = salary - (salary * taxRate);
			;
		}

		System.out.println("Your Net Salary is  " + salaryAfterTax);
	      }
	}

	
	

