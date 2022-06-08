import java.util.Locale;
import java.util.Scanner;

public class Numero1 {
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner cin = new Scanner(System.in);
		
		int x;
		
		x = cin.nextInt();
		
		for(int i = 1; i <= x; i++)
		{
			if(i % 2 > 0)
			{
				System.out.println(i);
			}
		}
		
		cin.close();
	}
}
