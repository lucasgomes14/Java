package entities;

public class Vehicle {
	
	//ATTRIBUTES
	private String model;

	//CONSTRUCTOR
	public Vehicle(String model) {
		this.model = model;
	}

	public Vehicle() {
	}

	//METHODES
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}	
}
