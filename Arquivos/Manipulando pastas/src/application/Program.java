package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS: \n");
		for(File file: folders) {
			System.out.println(file);
		}
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES: \n");
		for(File file : files) {
			System.out.println(file);
		}
		
		boolean success = new File(strPath + "//subdir").mkdir();
		System.out.println("Directory created sucessfully " + success);
		
		System.out.println("Enter a folder path: ");
		strPath = sc.nextLine();
		
		path = new File(strPath);
		
		System.out.println("getPath: " + path.getPath());
		System.out.println("getParent: " + path.getParent());
		System.out.println("getName: " + path.getName());
		
		sc.close();

	}

}
