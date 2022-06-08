package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner cin = new Scanner(System.in);
		
		CurrencyConverter conversion = new CurrencyConverter();
		
		System.out.print("What is the dollar price: ");
		conversion.dolarValue = cin.nextDouble();
		
		System.out.print("How many dollars will be bought: ");
		conversion.dolar = cin.nextDouble();
		
		System.out.println(conversion);
		
		cin.close();
	}

}
