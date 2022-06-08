package condicional;
import java.util.Locale;
import java.util.Scanner;

public class Numero2 {
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner cin = new Scanner(System.in);
		
		int num;
		
		num = cin.nextInt();
		
		if(num % 2 == 0)
		{
			System.out.println("PAR");
		}
		else
		{
			System.out.println("IMPAR");
		}
		
		cin.close();
	}
}
