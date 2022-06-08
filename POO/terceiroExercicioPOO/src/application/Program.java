package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Grade;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner cin = new Scanner(System.in);
		
		Grade grade = new Grade();
		
		grade.name = cin.nextLine();
		
		grade.grade1 = cin.nextDouble();
		grade.grade2 = cin.nextDouble();
		grade.grade3 = cin.nextDouble();
		
		System.out.println(grade);
		
		cin.close();
	}

}
