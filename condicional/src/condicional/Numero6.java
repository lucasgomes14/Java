package condicional;
import java.util.Locale;
import java.util.Scanner;

public class Numero6 {
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner cin = new Scanner(System.in);
		
		double num;
		
		num = cin.nextDouble();
		
		if(num >= 0 && num <= 25)
		{
			System.out.println("Intervalo [0,25]");
		}
		
		else if(num > 25 && num <= 50)
		{
			System.out.println("Intervalo (25,50]");
		}
		
		else if(num > 50 && num <= 75)
		{
			System.out.println("Intervalo (50,75]");
		}
		
		else if(num > 75 && num <= 100)
		{
			System.out.println("Intervalo (75,100]");
		}
		
		else
		{
			System.out.println("Fora do intervalo");
		}
		
		cin.close();
	}
}
