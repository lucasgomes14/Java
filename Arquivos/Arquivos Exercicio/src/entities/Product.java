package entities;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Product {
	//ATTRIBUTES
	private String name;
	private Double price;
	private Integer quantity;
	private String strPath;
	
	//CONSTRUCTOR
	public Product(String name, Double price, Integer quantity, String strPath) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.strPath = strPath;
	}

	//METHODES
	public String getName() {
			return name;
		}
	
	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getStrPath() {
		return strPath;
	}

	public void setStrPath(String strPath) {
		this.strPath = strPath;
	}
	
	public String productFinal() {		
		File path = new File(this.strPath);
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			bw.write(this.name + "," + String.format(("%.2f"),(this.price * this.quantity)));
			bw.newLine();
		}
		catch(IOException e) {
			System.out.println("Error writing file: " + e.getMessage());
		}
		return this.strPath + " CREATED!";
	}

	
}
