package com.capg.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.capg.model.Product;
import com.capg.ser.OrderSerimp;
import com.capg.ser.OrderService;

public class Main {
	private static OrderService ser = new OrderSerimp();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		Product pro = new Product();
		int i;
		System.out.println("Ener The Product Details");
		System.out.println("Enter the PRICE in DOLLARS");
		pro.setId((int) ((Math.random() * ((9999 - 1000) + 1)) + 1000));
		try{
		pro.setPrice(sc.nextDouble()); 
		System.out.println("Enter the Name of PRODUCT");
		 pro.setName(sc.next());
		 System.out.println("Enter quantity");
		 do{
		 i = pro.setQuantity(sc.nextInt());
		 if(i<1)
		 {
			 System.out.println("Quantity should be greater than one");
			 
		 }
		 }while(i<1);
		 
		 
		 ser.calculateOrder(pro);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Enter correct value type");
		}
	}

}
