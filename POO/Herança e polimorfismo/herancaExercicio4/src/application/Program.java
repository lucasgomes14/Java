package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.printf("Tax payer #%d data:", i);
			System.out.print("\nIndividual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Anual income: ");
			double value = sc.nextDouble();
			
			if(ch == 'i') {
				System.out.print("Health expenditures: ");
				double health = sc.nextDouble();
				
				list.add(new Individual(name, value, health));
			}
			else if(ch == 'c') {
				System.out.print("Number of employees: ");
				int employees = sc.nextInt();
				
				list.add(new Company(name, value, employees));
			}
		}
		
		System.out.println("\nTAXES PAID:");
		
		double sum = 0;
		
		for(TaxPayer tax : list) {
			System.out.println(tax.getName() + ": $ " + String.format("%.2f", tax.tax()));
			sum += tax.tax();
		}
		
		System.out.println("\nTOTAL TAXES: $ "+ String.format("%.2f", sum));
		sc.close();
	}
}
