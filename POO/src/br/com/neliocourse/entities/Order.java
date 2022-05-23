package br.com.neliocourse.entities;

import java.util.Date;

public class Order {

	public Date data;
	private Product product;

	public Order(Date data, Product product) {
		super();
		this.data = data;
		this.product = product;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
