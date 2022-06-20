package entities;

public class ImportedProduct extends Product{

	//ATTRIBUTES
	private double customsFee;
	
	//CONSTRUCTOR
	public ImportedProduct() {
		super();
	}
	
	public ImportedProduct(String name, double price, double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	
	//METHODS
	public double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(double customsFee) {
		this.customsFee = customsFee;
	}
	
	@Override
	public String priceTag() {
		return super.priceTag()
				+ " (Customs fee: $ "
				+ String.format("%.2f", customsFee)
				+ ")";
	}
	
}
