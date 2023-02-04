package util;

import java.util.function.Consumer;

import entities.Product;

public class PriceUpdate implements Consumer<Product>{

	@Override
	public void accept(Product t) {
		t.setPrice(t.getPrice() * 1.1);		
	}
	
}
