package entities;

import java.util.Date;

public class CarRental {
	
	//ATTRIBUTES
	private Date start;
	private Date finish;

	//ASSOCIATIONS
	private Vehicle vehicle;
	private Invoice invoice;

	//CONSTRUCTOR
	public CarRental() {
	}

	public CarRental(Date start, Date finish, Vehicle vehicle) {
		this.start = start;
		this.finish = finish;
		this.vehicle = vehicle;
	}

	//METHODES
	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getFinish() {
		return finish;
	}

	public void setFinish(Date finish) {
		this.finish = finish;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	
}
