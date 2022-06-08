package condicional;
import java.util.Locale;
import java.util.Scanner;

public class Numero5 {
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner cin = new Scanner(System.in);
		
		int codigo, quant;
		
		codigo = cin.nextInt();
		quant = cin.nextInt();
		
		if(codigo == 1)
		{
			System.out.printf("Total: R$ %.2f", (4.00 * quant));
		}
		
		else if(codigo == 2)
		{
			System.out.printf("Total: R$ %.2f", (4.50 * quant));
		}
		
		else if(codigo == 3)
		{
			System.out.printf("Total: R$ %.2f", (5.00 * quant));
		}
		
		else if(codigo == 4)
		{
			System.out.printf("Total: R$ %.2f", (2.00 * quant));
		}
		
		else if(codigo == 5)
		{
			System.out.printf("Total: R$ %.2f", (1.50 * quant));
		}
		
		cin.close();
	}
}
