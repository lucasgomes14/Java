import java.util.Locale;
import java.util.Scanner;

public class Numero4 {
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner cin = new Scanner(System.in);
		
		int n;
		double num1, num2;
		
		n = cin.nextInt();
		
		for(int i = 0; i < n; i++)
		{
			num1 = cin.nextInt();
			num2 = cin.nextInt();
			
			if(num2 == 0)
			{
				System.out.println("divisao impossivel");
			}
			
			else
			{
				System.out.printf("%.1f\n", num1/num2);
			}
		}
		
		cin.close();
	}
}
