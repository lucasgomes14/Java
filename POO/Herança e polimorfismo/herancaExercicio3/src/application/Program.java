package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.printf("Shape #%d data:",i);
			
			System.out.print("\nRectangle or Circle (r/c)? ");
			char form = sc.next().charAt(0);
			
			System.out.println("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			
			if(form == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				
				System.out.print("Height: ");
				double height = sc.nextDouble();
				
				list.add(new Rectangle(color, width, height));
			}
			else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				
				list.add(new Circle(color, radius));
			}
		}
		
		System.out.println("\nSHAPE AREAS:");
		
		for(Shape sh : list) {
			System.out.println(String.format("%.2f", sh.area()));
		}
		
		sc.close();
	}

}
