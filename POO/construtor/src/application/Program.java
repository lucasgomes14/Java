package application;

import java.util.Scanner;
import java.util.Locale;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner cin = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");	
		String name = cin.next();
		
		System.out.print("Price: ");
		double price = cin.nextDouble();
		
		System.out.print("Quantity in stock: ");
		int quantity = cin.nextInt();
		
		Product product = new Product(name, price, quantity);
		
		System.out.println("Poduct data: " + product);
		
		System.out.println();
		
		System.out.print("Enter the number of products to be added in stock: ");
		quantity = cin.nextInt();
		product.addProducts(quantity);
		
		System.out.println("updated data: " + product);
		
		System.out.println();
		
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = cin.nextInt();
		product.removeProducts(quantity);
		
		System.out.println("Poduct data: " + product);
		
		cin.close();
	}

}
