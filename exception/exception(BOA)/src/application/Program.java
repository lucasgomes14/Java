package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Model.Exception.DomainException;
import model.entities.Reservation;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.print("Room number: ");
			int number = sc.nextInt();
			
			System.out.print("Check-in date (dd/MM/yyyy):");
			Date checkin = sdf.parse(sc.next());
			
			System.out.print("Check-out date (dd/MM/yyyy):");
			Date checkout = sdf.parse(sc.next());
			
	
			Reservation reservation = new Reservation(number, checkin, checkout);
			System.out.println(reservation);
			
			System.out.println("\nEnter data to update the reservation:");
			
			System.out.print("Check-in date (dd/MM/yyyy):");
			checkin = sdf.parse(sc.next());
			
			System.out.print("Check-out date (dd/MM/yyyy):");
			checkout = sdf.parse(sc.next());
			
			reservation.updateDates(checkin, checkout);
			System.out.println(reservation);
		}
		catch (ParseException e) {
			System.out.println("Invalid date format");
		}
		catch (DomainException e) {
			System.out.println("Error in  reservation: " + e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}
		sc.close();
	}
}
