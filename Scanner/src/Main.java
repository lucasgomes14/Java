import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x, x4;
		int x1;
		double x2;
		char x3;
		
		x = sc.next();
		x1 = sc.nextInt();
		x2 = sc.nextDouble();
		x3 = sc.next().charAt(3);   //pega o item da posição x
		sc.nextLine();
		x4 = sc.nextLine();
		
		System.out.println("Você digitou:" + x);
		System.out.println("Você digitou:" + x1);
		System.out.println("Você digitou:" + x2);
		System.out.println("Você digitou:" + x3);
		System.out.println("Você digitou:" + x4);
		sc.close();
	}
}
