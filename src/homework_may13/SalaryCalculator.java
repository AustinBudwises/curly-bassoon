package homework_may13;

public class SalaryCalculator {

	public static void main(String[] args) {
	
		int hourlyRate = 60;
		int weeklyHour = 48;
		int stateTaxRate = 6;
		int federalTaxRate = 26;
		
		int salaryBeforeTax = hourlyRate*weeklyHour*52;
		int stateTax = salaryBeforeTax*stateTaxRate/100;
		int federalTax = salaryBeforeTax*federalTaxRate/100;
		int totalTax = stateTax + federalTax;
		int salaryAfterTax = salaryBeforeTax-totalTax;
		
		
		System.out.println("Salary" +":"+ "USD"  +salaryBeforeTax);
		System.out.println("State Tax" +":"+ "USD"+ stateTax);
		System.out.println("Federal Tax" +":"+"USD"+ federalTax);
		System.out.println("Total Tax"+ ":"+"USD" + totalTax);
		System.out.println("Net Income is"+":"+"USD"+ salaryAfterTax);
	}

}
