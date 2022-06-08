import java.util.Locale;
import java.util.Scanner;

public class Numero1 {
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner cin = new Scanner(System.in);
		
		int senha;
		
		while(true)
		{
			senha = cin.nextInt();
			
			if(senha == 2002)
			{
				System.out.println("Acesso Permitido");
				break;
			}
			else
			{
				System.out.println("Senha Invalida");
			}
		}
		
		cin.close();
	}
}
