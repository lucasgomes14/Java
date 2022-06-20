package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
	public static final SimpleDateFormat sdf =new SimpleDateFormat("dd/MM/yyyy");
	//ATTRIBUTES
	private Date manufactureDate;
	
	//CONSTRUCTOR
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	//METHODS
	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String priceTag() {
		return getName()
				+ "(used) $ "
				+ String.format("%.2f", getPrice())
				+ " (Manufacture date: "
				+ sdf.format(manufactureDate)
				+ ")";
		
	}
	
	
}
