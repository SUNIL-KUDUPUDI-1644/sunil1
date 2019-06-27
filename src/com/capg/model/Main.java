package com.capg.model;

import java.util.Scanner;

import com.capg.service.Ser;
import com.capg.service.Serimp;

public class Main {

	private static Ser service= new Serimp();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number\n1.SORTING\n2.DELETING");
		int n=sc.nextInt();
		switch(n)
		{
		case 1:
			service.sort();
			break;
		case 2:
			service.del();
			break;
			default:
		}
	}

}
