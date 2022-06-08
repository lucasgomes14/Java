package condicional;
import java.util.Locale;
import java.util.Scanner;

public class Numero7 {
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner cin = new Scanner(System.in);
	
		double num1, num2;
		
		num1 = cin.nextDouble();
		num2 = cin.nextDouble();
		
		if (num1 > 0 && num2 > 0)
		{
			System.out.println("Q1");
		}
		
		else if (num1 > 0 && num2 < 0)
		{
			System.out.println("Q4");
		}
		
		else if (num1 < 0 && num2 > 0)
		{
			System.out.println("Q2");
		}
		
		else if (num1 < 0 && num2 < 0)
		{
			System.out.println("Q3");
		}
		
		else if (num1 == 0 && (num2 > 0 || num2 < 0))
		{
			System.out.println("Eixo y");
		}
		
		else if (num2 == 0 && (num1 > 0 || num1 < 0))
		{
			System.out.println("Eixo x");
		}
		
		else
		{
			System.out.println("Origem");
		}
		
		cin.close();
	}
}
