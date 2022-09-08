package application;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaypalService;

public class App {
    public static void main(String[] args) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter contract data");
		
		System.out.print("Number: ");
		int number = sc.nextInt();		

		System.out.print("Date (dd/MM/yyyy): ");
		Date date = sdf.parse(sc.next());

		System.out.print("Contract value: ");
		double valueContract = sc.nextDouble();

		System.out.print("Enter number of installments: ");
		int installments = sc.nextInt();

		Contract contract = new Contract(number, date, valueContract);
		ContractService contractService = new ContractService(new PaypalService());

		contractService.processContract(contract, installments);

		System.out.println("Installments: ");

		for(Installment x : contract.getInstallment()){
			System.out.println(x);
		}
		sc.close();
    }
}
