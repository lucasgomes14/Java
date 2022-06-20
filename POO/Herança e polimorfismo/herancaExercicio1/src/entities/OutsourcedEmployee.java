package entities;

public class OutsourcedEmployee extends Employee{

	//ATTRIBUTES
	private double additionalCharge;
	
	//CONSTRUCTOR
	public OutsourcedEmployee() {
		super();
	}

	public OutsourcedEmployee(String name, int hours, double valuePerHour, double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}
	
	//METHODS
	public double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public double payment() {
		return super.payment() + additionalCharge * 1.1;
	}
}
