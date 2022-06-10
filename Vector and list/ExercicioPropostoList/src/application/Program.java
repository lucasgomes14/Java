package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Salary;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner cin = new Scanner(System.in);
		
		List<Salary> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered: ");
		int quant = cin.nextInt();
		
		//parte 1
		
		for(int i = 0; i < quant; i++)
		{
			System.out.printf("\nEmployees #%d\n", i + 1);
			
			System.out.print("Id: ");
			int id = cin.nextInt();
			
			while(hasId(list, id))
			{
				System.out.println("Id already taken. Try again: ");
				id = cin.nextInt();
			}
			
			System.out.print("Name: ");
			cin.nextLine();
			String name = cin.nextLine();
			
			System.out.print("Salary: ");
			double salary = cin.nextDouble();
			
			list.add(new Salary(id, name, salary));
		}
		
		//parte 2
		System.out.print("\nEnter the employee id that will have salary incrase: ");
		int id = cin.nextInt();
		
		Salary emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);		
		
		if(emp == null)
		{
			System.out.println("This id does not exist!");
		}
		
		else
		{
			System.out.print("Enter the percentage: ");
			double porcentage = cin.nextDouble();
			emp.percentage(porcentage);
		}
		
		//parte 3
		
		System.out.println("\nList of employees:");
		
		for(Salary obj : list)
		{
			System.out.println(obj);
		}
		
		cin.close();
	}
	
	public static boolean hasId(List<Salary> salary , int id)
	{
		Salary emp = salary.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
