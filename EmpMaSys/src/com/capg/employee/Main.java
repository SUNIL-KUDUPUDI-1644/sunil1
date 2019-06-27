package com.capg.employee;
import com.capg.empser.*;
import com.capg.empserimp.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static Empser service = new Empserimp();
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your choice:\n 1.Get emloyee details \n 2.All employees \n 3. del by id");
		int n=sc.nextInt();
		switch(n)
		{
		case 1:
			service.saveEmployee();
			break;
		case 2:
			List<Employee>l2=new ArrayList<Employee>();
			l2=service.getAllEmployees();
			System.out.println(l2);
			break;
		case 3:
			service.deleteEmp();
			break;
		default:	
			
		}
		sc.close();
		
	}

}
