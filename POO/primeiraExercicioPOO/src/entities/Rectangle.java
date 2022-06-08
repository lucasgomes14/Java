package entities;

public class Rectangle {
	
	//attributes
	public double width;
	public double height;
	
	//methodes
	public double area()
	{
		return width * height;
	}
	
	public double perimeter()
	{
		return 2 * (width + height);
	}
	
	public double diagonal()
	{
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}
	
	public String toString()
	{
		return "AREA = " + String.format("%.2f", area())
		+ "\nPERIMETER = " + String.format("%.2f", perimeter())
		+ "\nDIAGONAL = " + String.format("%.2f", diagonal());
	}
}
