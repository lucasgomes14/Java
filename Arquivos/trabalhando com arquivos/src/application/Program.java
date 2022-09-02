package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = null;
		File file = new File("//home//lucas//codigos//Java//trabalhando com arquivos//in.txt");
		
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch(IOException e){
			System.out.println("Error: " + e.getMessage());
		}
		
		finally {
			if(sc != null) {
				sc.close();
			}
		}
	}

}
