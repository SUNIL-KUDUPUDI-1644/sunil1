package com.capg.daoimpl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.capg.Db.*;
import com.capg.empdao.*;
import com.capg.employee.Employee;

public class Empdaoimpl implements Empdao {
	private Connection con;

	@Override
	public void save(Employee e) {
		con=Db.getConnection();
		try {
			Statement st= con.createStatement();
			PreparedStatement ps=con.prepareStatement("insert into emptr values(?,?,?)");
			ps.setInt(1, e.getId());
			ps.setString(2, e.getName());
			ps.setDouble(3, e.getSalary());
			int i=ps.executeUpdate();
			if(i>0)
				System.out.println("success");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		con = Db.getConnection();
		Employee e;
		List<Employee> list = new ArrayList<Employee>();
		PreparedStatement ps;
		try {
			ps=con.prepareStatement("select * from emptr order by id asc");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				e= new Employee();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setSalary(rs.getDouble(3));
				list.add(e);
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return list;
	}

	@Override
	public void deleteEmp(Employee e) {
		con=Db.getConnection();
		try {
			Statement st= con.createStatement();
			PreparedStatement ps=con.prepareStatement("delete from emptr where id=?");
			ps.setInt(1, e.getId());
			int i=ps.executeUpdate();
			if(i>0)
				System.out.println("success");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	

}
