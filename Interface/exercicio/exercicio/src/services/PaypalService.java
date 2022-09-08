package services;

public class PaypalService implements OnlinePaymentService {
	
	//Methodes
	public Double paymentFee(Double amount) {
		return amount * 1.02;
	}
	public Double interest(Double amount, Integer months) {
		return ((0.01 * months) + 1) * amount;
	}
}
