package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
	
		for(int i = 1; i <= n; i++) {
			System.out.printf("Employee #%d data: ", i);
			System.out.print("\nOutsourced (y/n)? ");
			char option = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Hours: ");
			int hour = sc.nextInt();
			
			System.out.print("Value per hour: ");
			double value = sc.nextDouble();
			
			if(option == 'y') {
				System.out.print("Additional charge: ");
				double valueAdditional = sc.nextDouble();
				
				list.add(new OutsourcedEmployee(name, hour, value, valueAdditional));
			}
			
			else {
				list.add(new Employee(name, hour, value));
			}

		}
		System.out.println("\nPAYMENTS:");
		
		for(Employee j : list) {
			System.out.println(j.getName() + " - $ " + j.payment());
		}
		
		sc.close();
		
	}

}
