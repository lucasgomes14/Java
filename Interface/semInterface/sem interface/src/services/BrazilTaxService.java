package services;

public class BrazilTaxService {

	//ATTRIBUTES
	
	//CONSTRUCTOR
	public BrazilTaxService() {
	}

	//METHODES
	public double tax(double amount){
		if(amount > 100.00){
			return amount * 0.15;
		}
		else{
			return amount * 0.20;
		}
	}
}
