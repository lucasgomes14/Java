package entities;

public class Account {
	
	//attributes
	private String name;
	private int number;
	private double balance;
	
	//constructor
	public Account(String name, int number, double valueDeposit) {
		this.name = name;
		this.number = number;
		this.balance = valueDeposit;
	}

	public Account(String name, int number) {
		this.name = name;
		this.number = number;
	}
	
	public Account()
	{
		
	}

	//methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance += balance;
	}
	
	public void deposit(double value)
	{
		this.balance += value;
	}
	
	public void withdraw(double value)
	{
		this.balance -= value;
		this.balance -= 5.00;
	}
	
	public String toString()
	{
		return "Account " + getNumber() 
		+ ", Holder: " + getName() 
		+ ", Balance: $ " + String.format("%.2f", getBalance());
	}
	
}
