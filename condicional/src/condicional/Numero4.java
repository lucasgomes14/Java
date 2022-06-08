package condicional;
import java.util.Locale;
import java.util.Scanner;

public class Numero4 {
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner cin = new Scanner(System.in);
		
		int hora1, hora2;
		
		hora1 = cin.nextInt();
		hora2 = cin.nextInt();
		
		if((hora1 >= 0 && hora1 < 24) && (hora2 >= 0 && hora2 < 24))
		{
			if(hora1 > hora2)
			{
				System.out.printf("O JOGO DUROU %d HORA(S)", ((24 - hora1) + hora2));
			}
			else if(hora2 > hora1)
			{
				System.out.printf("O JOGO DUROU %d HORA(S)", (hora2 - hora1));
			}
			else
			{
				System.out.printf("O JOGO DUROU %d HORA(S)", 24);
			}
		}
		
		cin.close();
	}
}
