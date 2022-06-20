package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
	public static void main(String[] args) {
		Account acc = new Account(1001, "Alex", 1000.00);
		acc.withdraw(200);
		System.out.println(acc.getBalance());
		
		Account acc1 = new SavingsAccount(1002, "Anna", 1000.00, 0.01);
		acc1.withdraw(200);
		System.out.println(acc1.getBalance());
		
		Account acc2 = new BusinessAccount(1003, "Bob", 1000.00, 500.00);
		acc2.withdraw(200);
		System.out.println(acc2.getBalance());
	}
}
