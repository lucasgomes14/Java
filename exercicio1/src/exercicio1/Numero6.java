package exercicio1;
import java.util.Locale;
import java.util.Scanner;

public class Numero6 {
	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner cin = new Scanner(System.in);
		
		double a, b, c;
		
		a = cin.nextDouble();
		b = cin.nextDouble();
		c = cin.nextDouble();
		
		System.out.printf("TRIANGULO: %.3f\n", ((a * c) / 2));
		System.out.printf("CIRCULO: %.3f\n", (Math.pow(c, 2) * 3.14159));
		System.out.printf("TRAPEZIO: %.3f\n", (((a + b) * c)) / 2);
		System.out.printf("QUADRADO: %.3f\n", (Math.pow(b, 2)));
		System.out.printf("RETANGULO: %.3f", (a * b));
		
		cin.close();
	}
}
