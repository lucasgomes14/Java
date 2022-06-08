package math;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C, delta, x1, x2;
		
		Scanner cin = new Scanner(System.in);

		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C + "\n");

		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);

		System.out.println(x + " elevado a " + y + " é = " + A);
		System.out.println(x + " elevado a 2 é = " + B);
		System.out.println("5 elevado a 2 é = " + C + "\n");
		
		A = Math.abs(x);
		B = Math.abs(y);
		C = Math.abs(z);
		
		System.out.println("O valor absoluto de " + x + " é = " + A);
		System.out.println("O valor absoluto de " + y + " é = " + B);
		System.out.println("O valor absoluto de " + z + " é = " + C);
		
		System.out.println("\nDigite os valores de A B C respectivamente");
		A = cin.nextDouble();
		B = cin.nextDouble();
		C = cin.nextDouble();
		
		delta = (Math.pow(B, 2)) - 4 * A * C;
		
		x1 = ((1 - B) + (Math.sqrt(delta)) / 2 * A);
		x2 = ((1 - B) - (Math.sqrt(delta)) / 2 * A);
		
		
		System.out.println("Delta = " + delta);
		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);
		
		
	}
}
