import java.util.Locale;
import java.util.Scanner;

public class Numero3 {
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner cin = new Scanner(System.in);
		
		int n;
		double a, b, c;
		
		n = cin.nextInt();
		
		for(int i = 0; i < n; i++)
		{
			a = cin.nextDouble() * 2;
			b = cin.nextDouble() * 3;
			c = cin.nextDouble() * 5;
			
			System.out.printf("%.1f\n", ((a + b + c) / 10));
		}
		
		cin.close();
	}
}
