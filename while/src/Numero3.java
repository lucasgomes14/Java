import java.util.Locale;
import java.util.Scanner;

public class Numero3 {
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner cin = new Scanner(System.in);
		
		int alcool = 0, gasolina = 0, diesel = 0, num;
		
		while(true)
		{
			num = cin.nextInt();
			
			if(num == 4)
			{
				System.out.printf("MUITO OBRIGADO\nAlcool: %d\nGasolina: %d\nDiesel: %d", alcool, gasolina, diesel);
				break;
			}
			
			else if(num == 1)
			{
				alcool++;
			}
			
			else if(num == 2)
			{
				gasolina++;
			}
			
			else if(num == 3)
			{
				diesel++;
			}
		}
		
		cin.close();
	}
}
