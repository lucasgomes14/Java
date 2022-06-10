package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Hotel;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner cin = new Scanner(System.in);
		
		Hotel[] vect = new Hotel[10];
		
		System.out.print("How many rooms will be rented: ");
		int quant = cin.nextInt();
		
		for(int i = 0; i < quant; i++)
		{
			System.out.printf("\nRent #%d", i+1);
			
			System.out.print("\nName: ");
			cin.nextLine();
			String name = cin.nextLine();
			
			System.out.print("Email: ");
			String email = cin.next();
			
			System.out.print("Room: ");
			int room = cin.nextInt();
			
			vect[room] = new Hotel(name, email, room);
		}
		
		System.out.println("\nBusy rooms:");
		
		for(int j = 0; j < vect.length; j++)
		{
			if(vect[j] != null)
			{
				System.out.println(vect[j]);
			}
		}
		
		cin.close();
	}

}
