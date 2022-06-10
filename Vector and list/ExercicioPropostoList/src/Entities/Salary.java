package Entities;

public class Salary {
	
	//attributes
	private Integer id;
	private String name;
	private double salary;
	
	//constructor
	public Salary(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	//methods
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void percentage(double percentage) {
		this.salary += (percentage / 100) * salary;
	}
	
	public String toString()
	{
		return getId() + ", "
				+ getName() + ", "
				+ String.format("%.2f", getSalary());
	}
}
