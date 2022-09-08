package services;

import java.util.Calendar;
import java.util.Date;

import entities.Contract;
import entities.Installment;

public class ContractService {
	
	//Associations
	private OnlinePaymentService onlinePaymentService;	

	//Constructor
	public ContractService() {
	}
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	//Methodes
	public OnlinePaymentService getOnlinePaymentService() {
		return onlinePaymentService;
	}
	public void setOnlinePaymentService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	public void processContract(Contract contract, Integer months) {
		double quota = contract.getTotalValue() / months;

		for(int i = 1; i <= months; i++){
			double interest = onlinePaymentService.interest(quota, i);
			double valueFinal = onlinePaymentService.paymentFee(interest);
			Date date = addMonth(contract.getDate(), i);

			contract.addInstallment(new Installment(date, valueFinal));
		}
	}
	private Date addMonth(Date date, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}

	
}
