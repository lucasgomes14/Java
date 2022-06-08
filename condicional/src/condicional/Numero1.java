package condicional;
import java.util.Locale;
import java.util.Scanner;

public class Numero1 {
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner cin = new Scanner(System.in);
		
		int num;
		
		num = cin.nextInt();
		
		if(num > 0)
		{
			System.out.println("POSITIVO");
		}
		else if(num == 0)
		{
			System.out.println("NÃO NEGATIVO");
		}
		else
		{
			System.out.println("NEGATIVO");
		}
		
		cin.close();
	}
}
