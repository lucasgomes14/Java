package entities;

public class Product {
	
	//attributes
	private String name;
	private double price;
	private int quantity;
	
	//constructor
	public Product(String name, double price, int quantity)
	{
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//methods
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public int getQuantity()
	{
		return quantity;
	}
	
	
	public String getName()
	{
		return name;
	}
	
	public double totalValueInStock()
	{
		return price * quantity;
	}
	
	public void addProducts(int quantity)
	{
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity)
	{
		this.quantity -= quantity;
	}
	
	public String toString()
	{
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity +" units, Total: $ " + String.format("%.2f", totalValueInStock());
	}
}
