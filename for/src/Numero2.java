import java.util.Locale;
import java.util.Scanner;

public class Numero2 {
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner cin = new Scanner(System.in);
		
		int n, x, in = 0, out = 0;
		
		n = cin.nextInt();
		
		for(int i = 0; i < n; i++)
		{
			x = cin.nextInt();
			
			if(x >= 10 && x <= 20)
			{
				in++;
			}
			
			else
			{
				out++;
			}
		}
		System.out.printf("%d in\n%d out", in, out);
		
		cin.close();
	}
}
