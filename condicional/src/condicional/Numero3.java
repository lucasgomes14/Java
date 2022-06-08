package condicional;
import java.util.Locale;
import java.util.Scanner;

public class Numero3 {
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner cin = new Scanner(System.in);
		
		int a, b;
		
		a = cin.nextInt();
		b = cin.nextInt();
		
		if(a >= b)
		{
			if(a % b == 0)
			{
				System.out.println("São Multiplos");
			}
			else
			{
				System.out.println("Não são Multiplos");
			}
		}
		else
		{
			if(b % a == 0)
			{
				System.out.println("São Multiplos");
			}
			else
			{
				System.out.println("Não são Multiplos");
			}
		}
		
		cin.close();
	}
}
