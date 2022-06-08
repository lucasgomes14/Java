package condicional;
import java.util.Locale;
import java.util.Scanner;

public class Numero8 {
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner cin = new Scanner(System.in);
		
		double salario;
		
		salario = cin.nextDouble();
		
		if(salario <= 2000.00)
		{
			System.out.println("Isento");
		}
		
		else if(salario <= 3000.00)
		{
			System.out.printf("R$ %.2f", (salario - 2000) * 0.08);
		}
		
		else if(salario <= 4500.00)
		{
			System.out.printf("R$ %.2f", (salario - 3000) * 0.18 + 1000 * 0.08);
		}
		
		else
		{
			System.out.printf("R$ %.2f", (salario - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08);
		}
		
		cin.close();
	}
}
