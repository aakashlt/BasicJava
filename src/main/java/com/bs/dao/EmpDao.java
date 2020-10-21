package com.bs.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmpDao {

	public void showDetails(){
		Connection con = null;
		Statement stmt = null;
		ResultSet  rs= null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/flightreservation","root","root");
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from user");
			while(rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
			}
			}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
		}
		
		
	}
}
