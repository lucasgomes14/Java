package entities;

public class Company extends TaxPayer{
	
	//ATTRIBUTES
	private int numberOfEmployees;

	//CONSTRUCTOR
	public Company() {
		super();
	}

	public Company(String name, double annualIncome, int numberOfEmployees) {
		super(name, annualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}
	
	//METHODS
	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	
	@Override
	public double tax() {
		double valueTax = 0;
		if(numberOfEmployees > 10) {
			valueTax = getAnnualIncome() * 0.14;
		}
		else if(numberOfEmployees <= 10) {
			valueTax = getAnnualIncome() * 0.16;
		}
		return valueTax;
	}
	

}
