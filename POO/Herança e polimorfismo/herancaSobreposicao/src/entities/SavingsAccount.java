package entities;

public class SavingsAccount extends Account{
	
	//attributes
	private double interestRate;
	
	//constructor
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(int number, String holder, double balance, double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	//methods
	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}
}

