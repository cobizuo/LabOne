import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class LabOne {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the principle of this account: $");
		double principle = input.nextDouble();
		System.out.print("Enter the annual interest rate: ");
		double interest_rate = input.nextDouble();
		System.out.print("Enter the number of times that the interest is compounded: ");
		int compound_rate = input.nextInt();
		System.out.print("Enter estimated duration of account: ");
		int account_age = input.nextInt();
		
		double final_bal = findInterest(principle, interest_rate, compound_rate, account_age);
		System.out.printf(Locale.US, "There will be $%,.2f in the account after %d years", final_bal, account_age);
		input.close();
	}
	
	public static double findInterest(double p, double interest_rate, int compound_rate, int age) {
		interest_rate = interest_rate / 100;
		int cRate_for_time = age * compound_rate;
		double iRate_for_cRate = (interest_rate / (double)compound_rate) + 1;
		double rates_for_time = Math.pow(iRate_for_cRate, cRate_for_time);
		double total_interest = rates_for_time * p;
		
		System.out.println(total_interest);
		return total_interest;
	}
}