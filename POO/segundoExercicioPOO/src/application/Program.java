package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employes;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner cin = new Scanner(System.in);
		
		Employes employes = new Employes();
		
		System.out.print("Name: ");
		employes.name = cin.nextLine();
		
		System.out.print("Gross salary: ");
		employes.grossSalary = cin.nextDouble();
		
		System.out.print("Tax: ");
		employes.tax = cin.nextDouble();
		
		System.out.println();
		
		employes.netSalary();
		
		System.out.println(employes);
		
		System.out.println();
		
		System.out.print("Which percentage to increase salary?");
		double porcentage = cin.nextDouble();
		employes.increaseSalary(porcentage);
		
		System.out.println();
		
		System.out.println(employes);
		
		cin.close();
	}

}
