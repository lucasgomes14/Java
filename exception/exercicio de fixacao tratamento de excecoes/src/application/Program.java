package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import exception.BusinessException;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	
		System.out.println("Enter account data");
		
		System.out.print("Number: ");
		int number = sc.nextInt();
		
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		
		System.out.print("Withdraw limit: ");
		double limit = sc.nextDouble();
		
		Account account = new Account(number, holder, balance, limit);
		
		System.out.print("\nEnter amount for withdraw: ");
		double withdraw = sc.nextDouble();
			
		try {
			account.withdraw(withdraw);
			System.out.printf("New balance: %.2f", account.getBalance());
		}
		catch(BusinessException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}
