package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;
import model.service.EmployeeService;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter full file path: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			List<Employee> list = new ArrayList<>();
			
			String line = br.readLine();

			while(line != null) {
				String[] fields = line.split(",");
				list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));

				line = br.readLine();
			}

			System.out.print("Enter salary: ");
			double salary = sc.nextDouble();
			System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary) + ":");

			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

			List<String> email = list.stream()
							.filter(p -> p.getSalary() > salary)
							.map(p -> p.getEmail())
							.sorted(comp)
							.collect(Collectors.toList());
			
			email.forEach(System.out::println);

			EmployeeService es = new EmployeeService();
			double letter = es.filderedSum(list, x -> x.getName().charAt(0) == 'M');

			System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", letter)) ;
			
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
    }
}
