package com.capg.ser;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.capg.model.Product;

public class OrderSerimpTest {
private OrderSerimp ser = new OrderSerimp();
Product p = new Product();
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals(0, ser.calculateOrder(p));
	}

}
