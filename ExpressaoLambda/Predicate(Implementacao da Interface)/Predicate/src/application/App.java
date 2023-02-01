package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import util.ProductPredicate;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

		List <Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD case", 80.90));

		list.removeIf(new ProductPredicate());

		for(Product p : list) {
			System.out.println(p);
		}
    }
}
