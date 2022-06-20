package entities;

import entities.enums.Color;

public class Circle extends Shape{
	
	//ATTRIBUTES
	private Double radius;
	
	//CONSTRUCTOR
	public Circle() {
		super();
	}

	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}
	
	//METHODS
	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}
	
	@Override
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}
	
}
