package com.capg.empserimp;
import com.capg.employee.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.capg.empdao.*;
import com.capg.daoimpl.*;
import com.capg.empser.*;

public class Empserimp implements Empser {
	private Empdao dao=new Empdaoimpl();

	private Scanner sc = new Scanner(System.in);

	@Override
	public void saveEmployee() {
		Employee e = new Employee();
		System.out.println("enter id");
	     e.setId(sc.nextInt());
		System.out.println("enter name");
		e.setName(sc.next());
		System.out.println("enter salary");
		e.setSalary(sc.nextDouble());
		dao.save(e);
		
	}

	@Override
	public  List<Employee> getAllEmployees() {
		
		List<Employee> l1=new ArrayList<Employee>();
		l1=dao.getAllEmployees();
		return l1;
	}

	@Override
	public void deleteEmp() {
		Employee e = new Employee();
		System.out.println("enter id");
		e.setId(sc.nextInt());
		dao.deleteEmp(e);
	}

}
