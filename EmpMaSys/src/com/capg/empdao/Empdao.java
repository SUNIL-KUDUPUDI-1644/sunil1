package com.capg.empdao;

import java.util.List;

import com.capg.employee.*;

public interface Empdao {
	void save(Employee e);
	List <Employee> getAllEmployees();
	void deleteEmp(Employee e);

}
