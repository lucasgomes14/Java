package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.printf("Product #%d data:", i);
			
			System.out.print("\nCommon, used or imported (c/u/i)? ");
			char type = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if(type == 'c') {
				list.add(new Product(name, price));
			}
			
			else if(type == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date date = sdf.parse(sc.next());
				
				list.add(new UsedProduct(name, price, date));
			}
			
			else {
				System.out.print("Customs fee: ");
				double valueImport = sc.nextDouble();
				
				list.add(new ImportedProduct(name, price, valueImport));
			}
		}
		
		System.out.println("\nPRICE TAGS:");
		for(Product j : list) {
			System.out.println(j.priceTag());
		}
		sc.close();
	}

}
