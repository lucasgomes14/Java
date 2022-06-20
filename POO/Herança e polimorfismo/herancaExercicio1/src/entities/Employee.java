package entities;

public class Employee {
	
	//attributes
	private String name;
	private int hours;
	private double valuePerHour;
	
	//constructor
	public Employee() {
	}

	public Employee(String name, int hours, double valuePerHour) {
		super();
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}

	//METHODS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	
	public double payment() {;
		return valuePerHour * hours;
	}
	
}
