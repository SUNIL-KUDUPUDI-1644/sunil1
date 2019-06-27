package com.capg.Db;
import java.sql.*;

public class Db {
	private static Connection con;
	public static Connection getConnection()
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","India123");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
		private Db(){
			
		}
	}


