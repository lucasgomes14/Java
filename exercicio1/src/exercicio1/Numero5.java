package exercicio1;
import java.util.Locale;
import java.util.Scanner;

public class Numero5 {
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner cin = new Scanner(System.in);
		
		int codigo1, codigo2, numero1, numero2;
		double valor1, valor2;
		
		codigo1 = cin.nextInt();
		numero1 = cin.nextInt();
		valor1 = cin.nextDouble();
		cin.nextLine();
		codigo2 = cin.nextInt();
		numero2 = cin.nextInt();
		valor2 = cin.nextDouble();
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", ((numero1 * valor1) + (numero2 * valor2)));
		
		cin.close();
	}
}
