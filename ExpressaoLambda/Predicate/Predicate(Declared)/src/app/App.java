package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

		List <Product> list = new ArrayList<>();

		double min = 100.0;

		Predicate<Product> pred = p -> p.getPrice() >= min;

		list.removeIf(pred);

		for(Product p : list) {
			System.out.println(p);
		}
    }
}
