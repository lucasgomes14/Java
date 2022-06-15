package entities;

public class OrderItem {
	
	//ATTRIBUTES
	private Integer quantity;
	private Double price;
	
	//ASSOCIATIONS
	private Product products;

	//CONSTRUCTOR
	public OrderItem() {
		
	}
	
	public OrderItem(int quantity, double price, Product products) {
		this.quantity = quantity;
		this.price = price;
		this.products = products;
	}

	//METHODS
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Product getProducts() {
		return products;
	}

	public void setProducts(Product products) {
		this.products = products;
	}
	
	public double subTotal() {
		return quantity * price;
	}
	
	//TOSTRING
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(products.getName() + ", $" + String.format("%.2f", price));
		sb.append(", Quantity: " + quantity);
		sb.append(", Subtotal: $" + String.format("%.2f", subTotal()));
		
		return sb.toString();
	}
}
