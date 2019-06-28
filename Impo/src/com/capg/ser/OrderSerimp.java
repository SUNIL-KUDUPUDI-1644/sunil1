package com.capg.ser;
import com.capg.dao.OrderRepo;
import com.capg.dao.OrderRepoImp;
import com.capg.model.Product;

public class OrderSerimp implements OrderService {
	private OrderRepo dao = new OrderRepoImp();
	@Override
	public int calculateOrder(Product p) {
		p.setCurrencyCC((((p.getPrice()*75)*1.25)/100));
		p.setPrice(p.getCurrencyCC()+(p.getPrice()*75));
		p.setPrice(p.getPrice()*p.getQuantity());
		return dao.saveOrder(p);
	}

}
