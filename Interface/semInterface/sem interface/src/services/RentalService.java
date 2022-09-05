package services;

import entities.CarRental;
import entities.Invoice;

public class RentalService {

	//ATTRIBUTES
	private Double pricePerHour;
	private Double pricePerDay;
	
	//ASSOCIATIONS
	private BrazilTaxService taxService;

	//CONSTRUCTOR
	public RentalService() {
	}

	public RentalService(double pricePerHour, double pricePerDay, BrazilTaxService taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}

	//METHODES
	public double getPricePerHour() {
		return pricePerHour;
	}

	public void setPricePerHour(double pricePerHour) {
		this.pricePerHour = pricePerHour;
	}


	public double getPricePerDay() {
		return pricePerDay;
	}


	public void setPricePerDay(double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}

	public void processInvoice(CarRental carRental) {
		double basicPayment;

		long t1 = carRental.getStart().getTime();
		long t2 = carRental.getFinish().getTime();

		double duration = (double) (t2 - t1) / 1000 / 60 / 60;

		if(duration <= 12.0) {
			basicPayment = Math.ceil(duration) * pricePerHour; 
		}
		else{
			basicPayment = Math.ceil(duration / 24) * pricePerDay;
		}

		double tax = taxService.tax(basicPayment);

		carRental.setInvoice(new Invoice(basicPayment, tax));
	}
	
}
