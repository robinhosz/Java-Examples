package br.com.neliocourse.entities;

public class Product {

	private String name;
	private double price;
	private int quantity;

	public Product() {

	}

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public double totalValuesInStock() {

		return price * quantity;

	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void RemoveProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", " + price + "," + quantity + ", units, Total: R$ " + totalValuesInStock();
	}
}
