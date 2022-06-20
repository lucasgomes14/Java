package entities;

public abstract class TaxPayer {
	
	//ATTRIBUTES
	private String name;
	private double annualIncome;
	
	//CONSTRUCTOR
	public TaxPayer() {
	}

	public TaxPayer(String name, double annualIncome) {
		this.name = name;
		this.annualIncome = annualIncome;
	}
	
	//METHODS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}
	
	public abstract double tax();	
}
