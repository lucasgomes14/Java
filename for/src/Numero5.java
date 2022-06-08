import java.util.Locale;
import java.util.Scanner;

public class Numero5 {
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner cin = new Scanner(System.in);
		
		int n, fatorial = 1;
		
		n = cin.nextInt();
		
		if(n == 0)
		{
			System.out.println(1);
		}
		
		else
		{
			for(int i = n; i > 0; i--)
			{
				fatorial *= i;
			}
			
			System.out.println(fatorial);
		}
		
		
		cin.close();
	}
}
