package model.services;

import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class ProductServices {
	public double filderedSum(List<Product> list, Predicate<Product> criteria) {
		double sum = 0.0;

		for(Product p : list) {
			if(criteria.test(p)) {
				sum += p.getPrice();
			}
		}
		return sum;
	}
}
