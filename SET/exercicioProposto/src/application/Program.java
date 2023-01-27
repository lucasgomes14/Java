package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] course = {"A", "B", "C"};

		Set<Integer> set = new HashSet<>();

		for(String c : course) {
			System.out.print("How many students for course " + c + "? ");
			int quantity = sc.nextInt();
			for(int i = 0; i < quantity; i++) {
				set.add(sc.nextInt());
			}
		}
		System.out.println("Total students: " + set.size());
		
		sc.close();
	}
}
