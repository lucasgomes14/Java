package entities;

import entities.enums.Color;

public class Rectangle extends Shape{
	
	//ATTRIBUTES
	private double width;
	private double heigth;
	
	//CONSTRUCTOR
	public Rectangle() {
		super();
	}

	public Rectangle(Color color, double width, double heigth) {
		super(color);
		this.width = width;
		this.heigth = heigth;
	}

	//METHODS
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeigth() {
		return heigth;
	}

	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}
	
	@Override
	public double area() {
		return width * heigth;
	}
}
