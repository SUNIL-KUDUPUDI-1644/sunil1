package com.capg.service;

import java.util.Scanner;

import com.capg.dao.Dao;
import com.capg.dao.Daoimp;

public class Serimp implements Ser {
	private Scanner sc = new Scanner(System.in);
	private Dao dao=new Daoimp();
	@Override
	public void sort() {
		System.out.println("Enter type of sort \n 1. sortById\n2.sortByName\n3.sortByPrice");
		int n =sc.nextInt();
		switch(n)
		{
		case 1:
			dao.sortById();
			break;
		case 2:
			dao.sortByName();
			break;
		case 3:
			dao.sortByPrice();
		default:
		}
		
	}
	@Override
	public void del() {
		System.out.println("Enter mobile id to be deleted");
		int k =sc.nextInt();
		dao.delete(k);
		
	}

}
