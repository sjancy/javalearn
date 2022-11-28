package com.jancy.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;




public class MySQLCommands {

	public static void main(String[] args) throws SQLException {


		//1.create a connection
		
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/janice","root","jerin");
		
		//2.create statement/query
		
		Statement stmt=con.createStatement();
		
		//String s="INSERT INTO STUDENT VALUES(104,'Jonathan')";
	    //String s="UPDATE STUDENT SET NAME='Sam' WHERE ID=102";
		 
		String s="DELETE FROM STUDENT WHERE ID=103";
		
		
		
		//3.Execuete the statement
		
		stmt.execute(s);
		
		//4.close the connection
		
		con.close();
		
		System.out.println("Query Executed...");

	}

}
