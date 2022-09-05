package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.CarRental;
import entities.Vehicle;
import services.BrazilTaxService;
import services.RentalService;

public class Program {
	public static void main(String[] args) throws ParseException{
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

		System.out.println("Enter rental data");
		System.out.print("Car model: ");
		String modelVehicle = sc.nextLine();

		System.out.print("Pickup (dd/MM/yyyy hh:mm): ");
		Date startDate = sdf.parse(sc.nextLine());

		System.out.print("Return (dd/MM/yyyy hh:mm): ");
		Date finishDate = sdf.parse(sc.nextLine());

		System.out.print("Enter price per hour: ");
		double perHour = sc.nextDouble();
		
		System.out.print("Enter price per day: ");
		double perDay = sc.nextDouble();

		CarRental carRental = new CarRental(startDate, finishDate, new Vehicle(modelVehicle));

		RentalService rentalService = new RentalService(perHour, perDay, new BrazilTaxService());

		rentalService.processInvoice(carRental);

		System.out.println("INVOICE:");
		System.out.println("Basic payment: " + String.format("%.2f", carRental.getInvoice().getBasicPayment()));
		System.out.println("Tax: " + String.format("%.2f", carRental.getInvoice().getTax()));
		System.out.println("Total payment: " + String.format("%.2f", carRental.getInvoice().getTotalPayment()));

		sc.close();
	}
}
