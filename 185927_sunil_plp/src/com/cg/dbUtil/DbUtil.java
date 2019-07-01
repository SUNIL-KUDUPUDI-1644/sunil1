package com.cg.dbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DbUtil {
	private static Connection con;
	public static Connection getConnection()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
		}catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		try
		{
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "India123");
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		return con;
	}
	private DbUtil()
	{
		
	}

}
