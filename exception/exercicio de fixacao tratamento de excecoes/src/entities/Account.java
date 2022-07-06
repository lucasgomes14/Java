package entities;

import exception.BusinessException;

public class Account {
	
	//ATTRIBUTES
	private Integer number;
	private String holder;
	private double balance;
	private double withdrawLimit;
	
	//CONSTRUCTOR
	public Account() {
		
	}

	public Account(int number, String holder, double balance, double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	
	
	//METHODS
	public Integer getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		validateWithdraw(amount);
		balance -= amount;
	}
	
	private void validateWithdraw(double amount) {
		if(amount > getWithdrawLimit()) {
			throw new BusinessException("Withdraw error: The amount exceeds withdraw limit");
		}
		if(amount > getBalance()) {
			throw new BusinessException("Withdraw error: The amount exceeds withdraw limit");
		}
	}
}
