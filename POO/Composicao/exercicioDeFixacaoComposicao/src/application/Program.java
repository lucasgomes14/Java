package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner cin = new Scanner(System.in);
		
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String nameClient = cin.nextLine();
		
		System.out.print("Email: ");
		String emailClient = cin.nextLine();
		
		System.out.print("Birth date (DD/MM/YYYY): ");
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		Date dateClient = sdf1.parse(cin.next());
		
		Client client = new Client(nameClient, emailClient, dateClient);
		
		System.out.println("Enter order data:");
		
		System.out.print("Status: ");		
		OrderStatus status = OrderStatus.valueOf(cin.next()); 
		
		System.out.print("How many items to this order? ");
		int n = cin.nextInt();
		
		Order order = new Order(new Date(), status, client);
		
		for(int i = 1; i <= n; i++)
		{
			System.out.printf("Enter #%d item data:", i);
			
			System.out.print("\nProduct name: ");
			cin.nextLine();
			String productName = cin.nextLine();
			
			System.out.print("Product price: ");
			double price = cin.nextDouble();
			
			Product product = new Product(productName, price);
			
			System.out.print("Quantity: ");
			int quantity = cin.nextInt();
			
			OrderItem orderItem = new OrderItem(quantity, price, product);
			
			order.addItem(orderItem);			
		}
		
		System.out.println("\nORDER SUMMARY:\n" + order);
		
		
		
		cin.close();
	}

}
