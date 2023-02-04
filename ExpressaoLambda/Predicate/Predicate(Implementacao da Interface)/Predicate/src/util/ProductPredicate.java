package util;

import java.util.function.Predicate;

import entities.Product;

public class ProductPredicate implements Predicate<Product> {

	@Override
	public boolean test(Product t) {
		return t.getPrice() >= 100.0;
	}
	
}
