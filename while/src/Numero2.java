import java.util.Locale;
import java.util.Scanner;

public class Numero2 {
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner cin = new Scanner(System.in);
		
		double x, y;
		
		while(true)
		{
			x = cin.nextDouble();
			y = cin.nextDouble();
			
			if(x == 0 || y == 0)
			{
				break;
			}
			else if(x > 0 && y > 0)
			{
				System.out.println("primeiro");
			}
			else if(x < 0 && y > 0)
			{
				System.out.println("segundo");
			}
			else if(x < 0 && y < 0)
			{
				System.out.println("terceiro");
			}
			else if(x > 0 && y < 0)
			{
				System.out.println("quarto");
			}
		}
		
		cin.close();
	}
}
