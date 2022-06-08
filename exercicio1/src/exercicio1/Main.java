package exercicio1;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner cin = new Scanner(System.in);
		int num1, num2;
		
		num1 = cin.nextInt();
		num2 = cin.nextInt();
		
		System.out.println("SOMA = " + (num1 + num2));
		
		cin.close();
	}
}
