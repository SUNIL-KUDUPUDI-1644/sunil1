package com.capg.dao;

import java.util.ArrayList;
import java.util.List;

import com.capg.model.Product;

public class OrderRepoImp implements OrderRepo{
	private List<Product> l1 = new ArrayList<Product>();

	public void save(Product pro) {
		l1.add(pro);
		
	}

	@Override
	public int saveOrder(Product pro) {
		l1.add(pro);
		System.out.println(l1);
		return 0;
	}
	

}
