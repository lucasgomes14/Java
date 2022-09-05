package entities;

public class Invoice {
	
	//ATTRIBUTES
	private Double basicPayment;
	private Double tax;
	
	//CONSTRUCTOR
	public Invoice() {
	}

	public Invoice(Double basicPayment, Double tax) {
		this.basicPayment = basicPayment;
		this.tax = tax;
	}

	//METHODES
	public Double getBasicPayment() {
		return basicPayment;
	}

	public void setBasicPayment(Double basicPayment) {
		this.basicPayment = basicPayment;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}
	
	public Double getTotalPayment() {
		return getTax() + getBasicPayment();
	}
}
