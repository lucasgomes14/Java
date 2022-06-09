package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner cin = new Scanner(System.in);
		
		Account account;
		
		System.out.print("Enter account number: ");
		int number = cin.nextInt();
		
		System.out.print("Enter account holder: ");
		cin.nextLine();
		String name = cin.nextLine();
		
		System.out.print("Is there na initial deposit (y/n): ");
		char condition = cin.next().charAt(0);
		
		if(condition == 'y')
		{
			System.out.print("Enter initial deposit value: ");
			double valueDeposit = cin.nextDouble();
			
			account = new Account(name, number, valueDeposit);
		}
		
		else 
		{
			account = new Account(name, number);
		}
			
		System.out.println("\nAccount data:\n" + account);
		
		System.out.print("\nEnter a deposit value: ");
		double value = cin.nextDouble();
		account.deposit(value);
		
		System.out.print("Updated account data:\n" + account);
		
		System.out.print("\n\nEnter a withdraw value: ");
		value = cin.nextDouble();
		account.withdraw(value);
		
		System.out.print("Updated account data:\n" + account);
		
		cin.close();
	}

}
