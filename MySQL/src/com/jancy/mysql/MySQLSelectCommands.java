package com.jancy.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class MySQLSelectCommands {

	public static void main(String[] args) throws SQLException {


		//1.create a connection
		
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Jerin","root","jerin");
		
		//2.create statement/query
		
		Statement stmt=con.createStatement();
		
         String s="select id,name,country from customers";
		
		
		//3.Execuete the statement && store the data in resultset
		
		ResultSet rs=stmt.executeQuery(s);
		
		while(rs.next()) {
			int cid=rs.getInt("id");
			String cname=rs.getString("name");
			String ccountry=rs.getString("country");
			
			System.out.println(cid+"   "+cname+"   "+ccountry);
			
		}
		
		//4.close the connection
		
		con.close();
		
		System.out.println("Query Executed...");

	}

}
