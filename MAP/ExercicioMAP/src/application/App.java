package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
		Scanner sc = new Scanner(System.in);

		Map<String, Integer> voting = new LinkedHashMap<>();

		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();

			while(line != null) {

				String[] candidate = line.split(",");
				String name = candidate[0];
				int votes = Integer.parseInt(candidate[1]);

				if(voting.containsKey(name)) {
					int count = voting.get(name);
					voting.put(name, count + votes);
				}
				else {
					voting.put(name, votes);
				}

				line = br.readLine();
			}

			for (String key : voting.keySet()) {
				System.out.println(key + ": " + voting.get(key));
			}

		} catch (Exception e) {
			System.out.println("Error : " + e);
		}

		sc.close();
    }
}
