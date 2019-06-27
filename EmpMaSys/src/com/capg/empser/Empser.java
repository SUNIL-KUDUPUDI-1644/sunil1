package com.capg.empser;

import java.util.List;

import com.capg.employee.*;

public interface Empser {
	public abstract void saveEmployee();
	List<Employee> getAllEmployees();
	public abstract void deleteEmp();
		
	}

