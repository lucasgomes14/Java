package entities;

public class Account {
	
	//attributes
	private int number;
	private String holder;
	protected double balance;
	
	//constructor
	public Account() {
	}

	public Account(int number, String holder, double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	
	//methods
	public int getNumber() {
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
	
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
}
