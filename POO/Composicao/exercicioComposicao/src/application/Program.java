package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner cin = new Scanner(System.in);
		
		HourContract contract = new HourContract();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String departmentName = cin.nextLine();
		
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String workedName = cin.nextLine();
		
		System.out.print("Level: ");
		String workedLevel = cin.nextLine();
		
		System.out.print("Base salary: ");
		double workedBaseSalary = cin.nextDouble();
		
		Worker worker = new Worker(workedName, WorkerLevel.valueOf(workedLevel), workedBaseSalary, new Department(departmentName));
		
		System.out.print("How many contracts to this worker? ");
		int x = cin.nextInt();
		
		for(int i = 1; i <= x; i++)
		{
			System.out.printf("Enter contract #%d data:", i);
			
			System.out.print("\nDate (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(cin.next());
			
			System.out.print("Value per hour: ");
			double valuePerHour = cin.nextDouble();
			
			System.out.print("Duration (hours): ");
			int DurationHour = cin.nextInt();
			
			contract = new HourContract(contractDate, valuePerHour, DurationHour);
			worker.addContract(contract);
		}
		
		System.out.print("\nEnter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = cin.next();
		
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDapartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		cin.close();
	}

}
