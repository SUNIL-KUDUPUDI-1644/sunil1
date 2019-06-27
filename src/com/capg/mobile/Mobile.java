package com.capg.mobile;

public class Mobile {
	private String name;
	private int price;
	private int mobid;
	private int qua;
	public Mobile(String name, int mobid, int price) {
		super();
		this.name = name;
		this.price = price;
		this.mobid = mobid;
	}
	public Mobile() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Mobile [name=" + name + ", price=" + price + ", mobid=" + mobid
				+ "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getMobid() {
		
		return mobid;
	}
	public void setMobid(int mobid) {
		this.mobid = mobid;
	}
	public int getQua() {
		return qua;
	}
	public void setQua(int qua) {
		this.qua = qua;
	}

	

}
