package exercicio1;
import java.util.Locale;
import java.util.Scanner;


public class Numero2 {
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner cin = new Scanner(System.in);
		
		double raio;
		
		raio = cin.nextDouble();
		
		System.out.printf("A=%.4f", (3.14159 * Math.pow(raio, 2)));
		
		cin.close();
	}

}
