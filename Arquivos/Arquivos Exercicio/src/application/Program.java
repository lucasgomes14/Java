package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter file path: ");
		String strPath = sc.nextLine();
		
		File directory = new File(strPath);
		
		File nameDirectory = directory.getParentFile();
		boolean sucess = new File(nameDirectory + "//out").mkdir();
		
		String path = nameDirectory + "//out//summary.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(directory))){
			String line = br.readLine();
			
			while(line != null) {
				String[] list = line.split(",");
				
				String name = list[0];
				double price = Double.parseDouble(list[1]);
				int quantity = Integer.parseInt(list[2]);
				
				Product product = new Product(name, price, quantity, path);
				product.productFinal();
				line = br.readLine();
			}
		}
		catch(IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}
		
		sc.close();
	}

}
