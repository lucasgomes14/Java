package services;

public interface OnlinePaymentService {
	
	//Methodes
	public Double paymentFee(Double amount);

	public Double interest(Double amount, Integer months);
	
}
