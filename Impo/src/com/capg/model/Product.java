package com.capg.model;

public class Product {
	private double price;
	private double currencyCC;
	public double getCurrencyCC() {
		return currencyCC;
	}
	public void setCurrencyCC(double currencyCC) {
		this.currencyCC = currencyCC;
	}
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private int quantity;
	private int id;
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public int setQuantity(int quantity) {
		this.quantity = quantity;
		return quantity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Product [price=" + price + ", currencyCC=" + currencyCC
				+ ", name=" + name + ", quantity=" + quantity + ", id=" + id
				+ "]";
	}

}
