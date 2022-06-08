package entities;

public class CurrencyConverter {
	
	//Attributes
	public double dolarValue;
	public double dolar;
	
	//Methodes
	public double conversion()
	{
		return (dolarValue * dolar) * 1.06;
	}
	
	public String toString()
	{
		return "Amount to be paid in reais = " + String.format("%.2f", conversion());
	}
}
