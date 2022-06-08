package exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Numero3 {
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner cin = new Scanner(System.in);
		int A, B, C, D;
		
		A = cin.nextInt();
		B = cin.nextInt();
		C = cin.nextInt();
		D = cin.nextInt();
		
		System.out.println("DIFERENCA = " + ((A * B) - (C * D)));
		
		cin.close();
	}
}
