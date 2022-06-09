package entities;

public class Product {
	
	//attributes
	public String name;
	public double price;
	public int quantity;
	
	//constructor
	public Product(String name, double price, int quantity)
	{
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//methods
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
