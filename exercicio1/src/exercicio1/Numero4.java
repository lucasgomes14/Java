package exercicio1;
import java.util.Locale;
import java.util.Scanner;

public class Numero4 {
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner cin = new Scanner(System.in);
		
		int numero;
		double horas, valor;
		
		numero = cin.nextInt();
		horas = cin.nextDouble();
		valor = cin.nextDouble();
		
		System.out.printf("NUMBER = %d\nSALARY = U$ %.2f", numero, (horas * valor));
		
		cin.close();
	}

}
